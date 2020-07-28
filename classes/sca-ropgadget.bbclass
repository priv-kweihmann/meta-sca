## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Threshold before issueing a warning
## all other findings are reported as info-only
SCA_ROPGADGET_WARNING_THRESHOLD ?= "500"

SCA_RAW_RESULT_FILE[ropgadget] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

inherit python3native

DEPENDS += "python3-ropgadget-native"

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

def do_sca_conv_ropgadget(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<bin>.*)\s+-\s+(?P<file>.*):(?P<line>\d+)\s+-\s+(?P<msg>.*)"

    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    _suppress = sca_suppress_init(d, "", None, file_trace=False)
    _findings = {}
    _findingsres = []

    if os.path.exists(sca_raw_result_file(d, "ropgadget")):
        with open(sca_raw_result_file(d, "ropgadget"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="ropgadget",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID="ropprone",
                                            Severity="info")
                    if _suppress.Suppressed(g):
                        continue
                    if g.File in _excludes:
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if not m.group("bin") in _findings.keys():
                        _findings[m.group("bin")] = 0
                    _findings[m.group("bin")] += 1
                    if g.Severity in sca_allowed_warning_level(d):
                        _findingsres.append(g)
                except Exception as exp:
                    bb.warn(str(exp))
    
    _threshold = 99999999999
    try:
        _threshold = int(d.getVar("SCA_ROPGADGET_WARNING_THRESHOLD"))
    except:
        pass

    for k, v in _findings.items():
        if v > _threshold:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="ropgadget",
                                    File=k,
                                    BuildPath=os.path.join(d.getVar("WORKDIR"), "packages-split"),
                                    Message="{} exceeded ROP exploit threshold ({}/{})".format(package_name, v, _threshold),
                                    ID="thresholdexceeded",
                                    Severity="warning")
            if _suppress.Suppressed(g):
                continue
            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findingsres.append(g)

    sca_add_model_class_list(d, _findingsres)
    return sca_save_model_to_string(d)

python do_sca_ropgadget() {
    import os
    import subprocess

    ## This module does not support suppression or fatal-error

    _args = [d.getVar("PYTHON")]
    _args += [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "ROPgadget")]
    _args += ["--binary"]

    _files = get_files_by_mimetype(d, os.path.join(d.getVar("WORKDIR"), "packages-split"),    
             ["application/x-executable", 'application/x-sharedlib', 'application/x-pie-executable'],[])
    ## Run
    cmd_output = ""
    raw_output = ""

    for _f in _files:
        if ("{}-dbg".format(d.getVar("PN")) in _f.split("/")) or os.path.islink(_f):
            ## Skip debug packages
            continue
        try:
            raw_output = subprocess.check_output(_args + [_f], universal_newlines=True)
        except subprocess.CalledProcessError as e:
            raw_output = e.stdout or ""
        cmd_output += convert_veryraw(d, _f, raw_output)
    with open(sca_raw_result_file(d, "ropgadget"), "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/ropgadget.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_ropgadget(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "ropgadget", get_fatal_entries(d, "", None))
}

SCA_DEPLOY_TASK = "do_sca_deploy_ropgadget"

python do_sca_deploy_ropgadget() {
    sca_conv_deploy(d, "ropgadget")
}

do_sca_ropgadget[doc] = "Find ROP exploitable pattern in binaries"
do_sca_deploy_ropgadget[doc] = "Deploy results of do_sca_ropgadget"
addtask do_sca_ropgadget before do_package_qa after do_package
addtask do_sca_deploy_ropgadget after do_sca_ropgadget before do_package_qa
