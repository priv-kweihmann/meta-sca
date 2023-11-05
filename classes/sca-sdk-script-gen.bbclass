## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

# define the functions in the order they should be run
# example 'do_configure do_something_else'
# these are always run **after** the autodetected ones
SCA_SDK_EXTRA_SCRIPTS ?= ""

# Always inject the following functions in python code
SCA_SDK_ALWAYS_INJECT_FUNCTIONS_PYTHON = "\
    exec_wrap_combine.* \
    get_suppress_entries \
    sca_log_note \
"

# Do not blocklist ourselves
SCA_BLACKLIST:remove:class-nativesdk = "nativesdk-.*"

inherit sca
inherit sca-sdk-overrides

def sdkgen_detend_code(dc, _input):
    _intend = ""
    _input = _input or ""
    for i in _input:
        if i in [" ", "\t"]:
            _intend += i
        else:
            break
    return _input.replace(_intend, "", 1).replace("\n" + _intend, "\n")

def sdkgen_find_functions_python(dc, _input, probe=False, reset=False):
    if not hasattr(sdkgen_find_functions_python, "seen") or reset:
        sdkgen_find_functions_python.seen = set()
    if _input.startswith('def '):
        _input = sdkgen_detend_code(dc, '\n'.join(_input.split('\n')[1:])).replace("return ", "__xyz = ")
    try:
        obj = compile(_input, "foo", "exec")
        _funcs = set(getattr(obj, 'co_names'))
    except (AttributeError, SyntaxError) as e:
        bb.warn("{} has an error: {}".format(_input, e))
        _funcs = set()
    _new = set(x for x in _funcs if x not in sdkgen_find_functions_python.seen)
    if not probe:
        sdkgen_find_functions_python.seen.update(_funcs)
    return _new

def sdkgen_reverse_expand_python(dc, _function, _overrides):
    import re

    _overridden = _overrides.get(_function, None)
    _funccode = sdkgen_detend_code(dc, dc.getVar(_overridden or _function))
    _globals = set()

    for _ in range(1, 3):
        # scan _funccode
        # - d.expand pattern -> replace with expanded value
        for m in re.finditer(r'd\.expand\("(?P<val>.*?)"\)', _funccode, re.MULTILINE):
            _funccode = _funccode.replace(m.group(0), '"' + m.group('val') + '"', 1)
        # - d.setVar pattern --> store in datasmart
        for m in re.finditer(r'd\.setVar\((?P<var>"[A-Z_0-9]+"),\s+(?P<val>.*)\s*\)', _funccode, re.MULTILINE):
            _val = (dc.getVar(m.group("var").strip('"')) or "")
            if _val.startswith("sdkgen_internal"):
                _funccode = _funccode.replace(m.group(0), "{} = {}".format(_val.replace("sdkgen_internal", "", 1), m.group("val")))
                _globals.add(_val.replace("sdkgen_internal", "", 1))
            else:
                if not dc.getVar(m.group('var').strip('"')):
                    dc.setVar(m.group('var').strip('"'), m.group('val'))
                    bb.debug(1, "setVar {} stored as {}".format(m.group('var'), dc.getVar(m.group('var').strip('"'))))
                _funccode = _funccode.replace(m.group(0), "")
        # - d.getVar pattern --> expand them
        for m in re.finditer(r'(self\.__)*d\.getVar\((?P<var>[A-Z_0-9a-z"]+)(,\s*False\s*)*\)', _funccode, re.MULTILINE):
            val = dc.getVar(m.group('var').strip('"')) or ""
            if val.startswith("sdkgen_internal"):
                _globals.add(val.replace("sdkgen_internal", "", 1).strip('"'))
                val = val.replace("sdkgen_internal", "", 1).strip('"')
            elif not val.startswith('"'):
                val = '"' + val + '"'
            bb.debug(1, "getVar {} == {} -> {}".format(m.group('var'), val, m.group(0)))
            _funccode = _funccode.replace(m.group(0), val)
        # - d.getVarFlag pattern --> expand them
        for m in re.finditer(r'd\.getVarFlag\("*(?P<var>[A-Z_0-9]+)"*,\s+(?P<val>.*?)\)', _funccode, re.MULTILINE):
            val = dc.getVarFlag(m.group('var'), m.group('val')) or ""
            if not val.startswith('"'):
                val = '"' + val + '"'
            _funccode = _funccode.replace(m.group(0), val)
        # - clean_split(...) pattern --> expand them
        for m in re.finditer(r'clean_split\(d,\s+"(?P<var>[A-Z_0-9]+)"\)', _funccode, re.MULTILINE):
            val = clean_split(dc, m.group('var'))
            _funccode = _funccode.replace(m.group(0), str(val))
        # - clean_split(...) variable passed pattern --> replace function
        for m in re.finditer(r'clean_split\(d,\s+(?P<var>[A-Z_0-9a-z]+)\)', _funccode, re.MULTILINE):
            val = '[x for x in (' + m.group('var') + ' or "").split(" ") if x and x not in ["\\\\"]]'
            _funccode = _funccode.replace(m.group(0), val)
        # - replace come bitbake functionality
        for m in re.finditer(r'bb\.build\.exec_func\("*(?P<var>.*)"*,\s+.\)', _funccode, re.MULTILINE):
            _funccode = _funccode.replace(m.group(0), m.group('var').strip('"') + "()")
        for m in re.finditer(r'bb\.data\.inherits_class\(.*\)', _funccode, re.MULTILINE):
            _funccode = _funccode.replace(m.group(0), "False")
        for m in re.finditer(r'bb\.(warn|error)\(', _funccode, re.MULTILINE):
            _funccode = _funccode.replace(m.group(0), "print(")
        for m in re.finditer(r'bb\.(verb)*note\(.*\)', _funccode, re.MULTILINE):
            _funccode = _funccode.replace(m.group(0), "pass")
        for m in re.finditer(r'bb\.debug\(.*\)', _funccode, re.MULTILINE):
            _funccode = _funccode.replace(m.group(0), "pass")
        for m in re.finditer(r'import bb.*', _funccode, re.MULTILINE):
            _funccode = _funccode.replace(m.group(0), "#" + m.group(0))
    # inject globals
    _lines = _funccode.split("\n")
    for g in _globals:
        _lines.insert(1, "    global " + g + "\n")
    _funccode = "\n".join(_lines)
    res = [_funccode]

    if _overridden:
        res += [ "\n{} = {}\n".format(_function, _overridden) ]

    bb.debug(1, "{} has {}".format(_function, sdkgen_find_functions_python(dc, _funccode, probe=True)))
    for _f in sdkgen_find_functions_python(dc, _funccode):
        bb.debug(1, "Expanding {}".format(_f))
        res.insert(0, sdkgen_reverse_expand_python(dc, _f, _overrides))
    return "\n\n".join([x for x in res if x])

def sdkgen_get_expanded_function(d, _function):
    import os
    import re

    _target_file = d.expand("${{WORKDIR}}/sca.run.{}".format(_function))

    # override some internals
    _overrides = {
        "SCA_SOURCES_DIR": ("%SOURCES%", "os.getcwd()", "${PWD}"),
        "S": ("%S%", "os.getcwd()", "${PWD}"),
        "D": ("%B%", "os.getcwd()", "${PWD}"),
        "B": ("%D%", "os.getcwd()", "${PWD}"),
        "TOPDIR": ("%TOPDIR%", "os.getcwd()", "${PWD}"),
        "IMAGE_ROOTFS": ("%ROOTFS%", "os.getcwd()", "${PWD}"),
        "SCA_EXPORT_DIR": ("%EXPORTDIR%", "os.getcwd()", "${PWD}"),
        "SCA_FINDINGS_DIR": ("%EXPORTDIR%", "os.getcwd()", "${PWD}"),
        "BB_NUMBER_THREADS": ("%THREADS%", "os.environ.get('THREADS', '1')", "${THREADS:-1}"),
    }

    _hardoverrides = {
        "__SCA_DATAMODEL_STORAGE": "sdkgen_internal__storage",
        "BBINCLUDED": "",
        "BBLAYERS": "",
        "PKGDATA_DIR": "/doesnotexist",
        "SCA_LOCAL_FILE_FILTER": "",
        "SCA_NO_TRACEFILES": "on",
        "STAGING_BINDIR_NATIVE": d.expand("${bindir}"),   
        "STAGING_BINDIR": d.expand("${bindir}"),
        "STAGING_DATADIR_NATIVE": d.expand("${datadir}"),
        "STAGING_DATADIR": d.expand("${datadir}"),
        "STAGING_DIR_NATIVE": d.expand("${SDKPATHNATIVE}"),
        "STAGING_DIR": d.expand("${SDKPATHNATIVE}"),
        "STAGING_INCDIR_NATIVE": d.expand("${incdir}"),
        "STAGING_INCDIR": d.expand("${incdir}"),
        "STAGING_LIBDIR_NATIVE": d.expand("${libdir}"),
        "STAGING_LIBDIR": d.expand("${libdir}"),
        "T": "/tmp",
    }

    _function_overrides = {
        "do_sca_deploy": "do_sca_deploy_sdk",
        "sca_backtrack_findings": "sca_backtrack_findings_sdk",
        "sca_conv_to_export": "sca_conv_to_export_sdk",
        "sca_filter_by_license_image": "sca_filter_by_license_image_sdk",
        "sca_log_note": "sca_log_note_sdk",
        "sca_module_applicable": "sca_module_applicable_sdk",
        "sca_raw_result_file": "sca_raw_result_file_sdk",
        "sca_task_aftermath": "sca_task_aftermath_sdk",
        "should_emit_to_console": "should_emit_to_console_sdk",
    }

    dc = d.createCopy()

    # some basic variable settings
    dc.setVar("SCA_MODE", "recipe")
    for k, v in _overrides.items():
        dc.setVar(k, v[0])

    for k, v in _hardoverrides.items():
        dc.setVar(k, v)
    
    _flags = dc.getVarFlags(_function) or {}
    _ispython = _flags.get('python', '0') == '1'

    if _ispython:
        _extra_injects = clean_split(dc, "SCA_SDK_ALWAYS_INJECT_FUNCTIONS_PYTHON") or []
        _raw_script = sdkgen_reverse_expand_python(dc, _function, _function_overrides)
        for key in dc.keys():
            _flags = dc.getVarFlags(key) or {}
            if "func" in _flags and any(re.match(x, key) for x in _extra_injects):
                _raw_script = sdkgen_reverse_expand_python(dc, key, _function_overrides) + "\n" + _raw_script 
        _script = "#!/usr/bin/env python3\nd = {}\n__storage = \"[]\"\n" + _raw_script
    else:
        _script = "#!/bin/sh\n" + sdkgen_detend_code(dc, dc.getVar(_function))

    # replace the overrides with something configurable
    for _, v in _overrides.items():
        _script = _script.replace('"' + v[0] + '"', v[1] if _ispython else v[2])
        _script = _script.replace(v[0], v[1] if _ispython else v[2])

    os.makedirs(os.path.dirname(_target_file), exist_ok=True)
    bb.debug(1, "{function} expanded to {res}".format(function=_function, res=_script))
    # dump the combined _funccode and return a path to the script
    with open(_target_file, "w") as o:
        o.write(_script)
    return "sca.run.{}".format(_function)

python do_sca_sdk_script_gen() {
    pass
}
   

python do_sca_sdk_script_gen:class-nativesdk() {
    res = []
    _detected = (d.getVar("SCA_SDKGEN_TASKS") or "").split()
    _detected += clean_split(d, "SCA_SDK_EXTRA_SCRIPTS")
    
    for item in _detected:
        bb.debug(1, "Expanding ... {}".format(item))
        sdkgen_find_functions_python(d, "", True, True)
        res.append(sdkgen_get_expanded_function(d, item))
    
    if res:
        _target_file = d.expand("${WORKDIR}/sca.${SCA_TOOL_DESCRIPTION}.sh")
        os.makedirs(os.path.dirname(_target_file), exist_ok=True)
        with open(_target_file, "w") as o:
            o.write("#!/bin/sh\n")
            o.write("\n".join(res))
}

do_install:append:class-nativesdk() {
    if [ -n "${SCA_SDKGEN_TASKS}" ]; then
        install -d ${D}${bindir}
        install -m 0755 ${WORKDIR}/sca.*.sh ${D}${bindir} || bbwarn "Please clean the sstate cache and run again"
        install -m 0755 ${WORKDIR}/sca.run.* ${D}${bindir} || true
    fi
}

FILES:${PN}:append:class-nativesdk = " \
    ${bindir}/sca.run.* \
    ${bindir}/sca.* \
"

addtask do_sca_sdk_script_gen after do_patch before do_install
