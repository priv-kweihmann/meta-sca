## Threshold before issueing a warning
## all other findings are reported as info-only
SCA_ROPGADGET_WARNING_THRESHOLD ?= "500"

inherit sca-helper
inherit sca-conv-checkstyle-ropgadget
inherit sca-global

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3native', 'pythonnative')}

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-ropgadget-native"

PACKAGE_DEBUG_SPLIT_STYLE = '.debug'

def convert_veryraw(d, bin, content):
    import os
    import re
    import subprocess
    _addr2line = os.environ.get("AS", "-as").replace("-as", "-addr2line").strip()
    _args = [_addr2line]
    ## Find debug symbol file
    _relpath = os.path.relpath(bin, 
                               os.path.join(d.getVar("WORKDIR"), "packages-split", d.getVar("PN")))
    _dbg = os.path.join(os.path.join(d.getVar("WORKDIR"), "packages-split", 
            "{}-dbg".format(d.getVar("PN")), os.path.dirname(_relpath), ".debug", os.path.basename(bin)))
    output = ""
    if os.path.isfile(_dbg):
        for m in re.finditer(r"^(?P<addr>0x\w+)\s+:\s+(?P<msg>.*)", content, re.MULTILINE):
            _t_args = _args + ["-e", _dbg, m.group("addr")]
            try:
                _out = subprocess.check_output(_t_args, universal_newlines=True)
                for im in re.finditer(r"(?P<file>.*):(?P<line>\d+)", _out):
                    _file = os.path.abspath(im.group("file"))
                    output += "{} - {}:{} - {}\n".format(bin, _file, im.group("line"), m.group("msg"))
            except Exception as e:
                bb.note(str(e))
    return output

python do_sca_ropgadget() {
    import os
    import subprocess

    ## This module does not support suppression or fatal-error

    _args = [d.getVar("PYTHON")]
    _args += [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "ROPgadget")]
    _args += ["--binary"]

    _files = get_files_by_mimetype(d, os.path.join(d.getVar("WORKDIR"), "packages-split"), ["application/x-executable", 'application/x-sharedlib'],[])
    ## Run
    cmd_output = ""
    raw_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_ropgadget.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    for _f in _files:
        if ("{}-dbg".format(d.getVar("PN")) in _f.split("/")) or os.path.islink(_f):
            ## Skip debug packages
            continue
        try:
            raw_output = subprocess.check_output(_args + [_f], universal_newlines=True)
        except subprocess.CalledProcessError as e:
            raw_output = e.stdout or ""
        cmd_output += convert_veryraw(d, _f, raw_output)
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_ropgadget.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_ropgadget(d)
    with open(result_file, "w") as o:
        o.write(conv_output)

    # ## Evaluate
    _warnings = get_warnings_from_result(d)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings) and should_emit_to_console(d):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors) and should_emit_to_console(d):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
}

python do_sca_deploy_ropgadget() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "ropgadget", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "ropgadget", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "ropgadget", "raw", "{}-{}.txt".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "ropgadget", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_ropgadget.txt")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_ropgadget.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_ropgadget before do_package_qa after do_package
addtask do_sca_deploy_ropgadget after do_sca_ropgadget before do_package_qa
