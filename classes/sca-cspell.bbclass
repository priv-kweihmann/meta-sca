## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_CSPELL_CHECK_LANG ?= "CPP HTML PYTHON TXT"

## Lang spec implementation
SCA_CSPELL_LANG_CPP_dicts ?= "cpp"
SCA_CSPELL_LANG_CPP_files ?= ".c .cpp .h .hpp"
SCA_CSPELL_LANG_HTML_dicts ?= "html css typescript"
SCA_CSPELL_LANG_HTML_files ?= ".html .htm .js"
SCA_CSPELL_LANG_PYTHON_dicts ?= "python"
SCA_CSPELL_LANG_PYTHON_files ?= ".py"
SCA_CSPELL_LANG_PYTHON_shebang ?= "${SCA_PYTHON_SHEBANG}"
SCA_CSPELL_LANG_TXT_dicts ?= ""
SCA_CSPELL_LANG_TXT_files ?= ".txt .md .rst"

SCA_RAW_RESULT_FILE[cspell] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress
inherit sca-tracefiles

def write_config(_base, _extra_dicts, _target):
    import os
    import json
    import copy
    obj = copy.deepcopy(_base)
    for k, v in _extra_dicts.items():
        obj["dictionaries"].append(k)
        obj["dictionaryDefinitions"].append(v)
    with open(_target, "w") as o:
        json.dump(obj, o)

def do_sca_conv_cspell(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*)\:(?P<line>\d+):(?P<column>\d+)\s+-\s+(?P<id>.*)\s+\((?P<msg>.*)\)"
    _suppress = sca_suppress_init(d, "", None)
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "cspell")):
        with open(sca_raw_result_file(d, "cspell"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="cspell",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Column=m.group("column"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity="info")
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as e:
                    bb.warn(str(e))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_cspell() {
    import os
    import subprocess
    import json

    _config = {
        "version": "0.1",
        "language": "en",
        "ignorePaths": [],
        "maxNumberOfProblems": 1000000,
        "dictionaries": ["en_US", "softwareTerms", "misc", "filetypes", "fonts", "fullstack", "user"],
        "dictionaryDefinitions": [
            { "name": "en_US", "path": "{}/node_modules/cspell/node_modules/cspell-dict-en_us/en_US.trie.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
            { "name": "fullstack", "path": "{}/node_modules/cspell/node_modules/cspell-dict-fullstack/fullstack.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
            { "name": "softwareTerms", "path": "{}/node_modules/cspell/dist/dictionaries/softwareTerms.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
            { "name": "misc", "path": "{}/node_modules/cspell/dist/dictionaries/miscTerms.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
            { "name": "filetypes", "path": "{}/node_modules/cspell/dist/dictionaries/filetypes.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
            { "name": "fonts", "path": "{}/node_modules/cspell/dist/dictionaries/fonts.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
            { "name": "user", "path": "{}/cspell-user/cspell_user.txt".format(d.getVar("STAGING_DATADIR_NATIVE"))}
        ]
    }

    _lang_configs = {
        "cpp": { "name": "cpp", "path": "{}/node_modules/cspell/node_modules/cspell-dict-cpp/cpp.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "csharp": { "csharp": "cpp", "path": "{}/node_modules/cspell/dist/dictionaries/csharp.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "css": { "css": "cpp", "path": "{}/node_modules/cspell/dist/dictionaries/css.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "django": { "django": "cpp", "path": "{}/node_modules/cspell/node_modules/cspell-dict-django/django.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "dotnet": { "dotnet": "cpp", "path": "{}/node_modules/cspell/dist/dictionaries/dotnet.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "elixir": { "elixir": "cpp", "path": "{}/node_modules/cspell/node_modules/cspell-dict-elixir/elixir.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "go": { "name": "go", "path": "{}/node_modules/cspell/node_modules/cspell-dict-golang/go.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "html": { "name": "html", "path": "{}/node_modules/cspell/dist/dictionaries/html.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "java": { "name": "java", "path": "{}/node_modules/cspell/node_modules/cspell-dict-java/java.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "node": { "name": "node", "path": "{}/node_modules/cspell/dist/dictionaries/node.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "npm": { "name": "npm", "path": "{}/node_modules/cspell/dist/dictionaries/npm.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "php": { "name": "php", "path": "{}/node_modules/cspell/node_modules/cspell-dict-php/php.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "powershell": { "name": "powershell", "path": "{}/node_modules/cspell/dist/dictionaries/powershell.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "python": { "name": "python", "path": "{}/node_modules/cspell/node_modules/cspell-dict-python/python.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "rust": { "name": "rust", "path": "{}/node_modules/cspell/node_modules/cspell-dict-rust/rust.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "scala": { "name": "scala", "path": "{}/node_modules/cspell/node_modules/cspell-dict-scala/scala.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
        "typescript": { "name": "typescript", "path": "{}/node_modules/cspell/dist/dictionaries/typescript.txt.gz".format(d.getVar("STAGING_LIBDIR_NATIVE"))},
    }

    _config_file = os.path.join(d.getVar("T"), "cspell.json")

    _args = ["cspell"]
    _args += ["-c", _config_file]
    _args += ["--no-color"]

    cmd_output = ""
    ## Get all vars
    for k in clean_split(d, "SCA_CSPELL_CHECK_LANG"):
        _files = d.getVar("{}{}_files".format("SCA_CSPELL_LANG_", k)) or ""
        _dicts = d.getVar("{}{}_dicts".format("SCA_CSPELL_LANG_", k)) or ""
        _shebang = d.getVar("{}{}_shebang".format("SCA_CSPELL_LANG_", k)) or ".*"
        _check_files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), _shebang, _files,
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
        if any(_check_files):
            write_config(_config, {k:v for k,v in _lang_configs.items() if k in _dicts.split(" ")}, _config_file)
            cmd_output += exec_wrap_check_output(_args, _check_files)

    with open(sca_raw_result_file(d, "cspell"), "w") as o:
        o.write(cmd_output)
}

python do_sca_cspell_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/cspell.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_cspell(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "cspell")
}

SCA_DEPLOY_TASK = "do_sca_deploy_cspell"

python do_sca_deploy_cspell() {
    sca_conv_deploy(d, "cspell")
}

do_sca_cspell[doc] = "Lint test files with cspell"
do_sca_cspell_report[doc] = "Report findings of do_sca_cspell"
do_sca_deploy_cspell[doc] = "Deploy results of do_sca_cspell"
addtask do_sca_cspell after do_compile before do_sca_tracefiles
addtask do_sca_cspell_report after do_sca_tracefiles
addtask do_sca_deploy_cspell after do_sca_cspell_report before do_package

DEPENDS += "cspell-native sca-recipe-cspell-rules-native cspell-user-dict-native"
