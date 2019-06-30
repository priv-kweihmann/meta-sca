SCA_CSPELL_CHECK_LANG ?= "CPP HTML PYTHON TXT"

## Lang spec implementation
SCA_CSPELL_LANG_CPP_dicts ?= "cpp"
SCA_CSPELL_LANG_CPP_files ?= ".c .cpp .h .hpp"
SCA_CSPELL_LANG_HTML_dicts ?= "html css typescript"
SCA_CSPELL_LANG_HTML_files ?= ".html .htm .js"
SCA_CSPELL_LANG_PYTHON_dicts ?= "python"
SCA_CSPELL_LANG_PYTHON_files ?= ".py"
SCA_CSPELL_LANG_PYTHON_shebang ?= ".*python"
SCA_CSPELL_LANG_TXT_dicts ?= ""
SCA_CSPELL_LANG_TXT_files ?= ".txt .md .rst"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter

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

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
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
                    if g.Severity in sca_allowed_warning_level(d):
                        sca_add_model_class(d, g)
                except Exception as e:
                    bb.warn(str(e))

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
        "dictionaries": ["en_US", "companies", "softwareTerms", "misc", "filetypes", "fonts", "fullstack"],
        "dictionaryDefinitions": [
            { "name": "en_US", "path": "{}/cspell/node_modules/cspell-dict-en_us/en_US.trie.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
            { "name": "companies", "path": "{}/cspell/node_modules/cspell-dict-companies/companies.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
            { "name": "fullstack", "path": "{}/cspell/node_modules/cspell-dict-fullstack/fullstack.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
            { "name": "softwareTerms", "path": "{}/cspell/node_modules/cspell/dist/dictionaries/softwareTerms.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
            { "name": "misc", "path": "{}/cspell/node_modules/cspell/dist/dictionaries/miscTerms.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
            { "name": "filetypes", "path": "{}/cspell/node_modules/cspell/dist/dictionaries/filetypes.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
            { "name": "fonts", "path": "{}/cspell/node_modules/cspell/dist/dictionaries/fonts.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))}
        ]
    }

    _lang_configs = {
        "cpp": { "name": "cpp", "path": "{}/cspell/node_modules/cspell-dict-cpp/cpp.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "csharp": { "csharp": "cpp", "path": "{}/cspell/node_modules/cspell/dist/dictionaries/csharp.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "css": { "css": "cpp", "path": "{}/cspell/node_modules/cspell/dist/dictionaries/css.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "django": { "django": "cpp", "path": "{}/cspell/node_modules/cspell-dict-django/django.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "dotnet": { "dotnet": "cpp", "path": "{}/cspell/node_modules/cspell/dist/dictionaries/dotnet.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "elixir": { "elixir": "cpp", "path": "{}/cspell/node_modules/cspell-dict-elixir/elixir.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "go": { "name": "go", "path": "{}/cspell/node_modules/cspell-dict-golang/go.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "html": { "name": "html", "path": "{}/cspell/node_modules/cspell/dist/dictionaries/dotnet.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "java": { "name": "java", "path": "{}/cspell/node_modules/cspell-dict-java/java.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "node": { "name": "node", "path": "{}/cspell/node_modules/cspell/dist/dictionaries/node.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "npm": { "name": "npm", "path": "{}/cspell/node_modules/cspell/dist/dictionaries/npm.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "php": { "name": "php", "path": "{}/cspell/node_modules/cspell-dict-php/php.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "powershell": { "name": "powershell", "path": "{}/cspell/node_modules/cspell/dist/dictionaries/powershell.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "python": { "name": "python", "path": "{}/cspell/node_modules/cspell-dict-python/python.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "rust": { "name": "rust", "path": "{}/cspell/node_modules/cspell-dict-rust/rust.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "scala": { "name": "scala", "path": "{}/cspell/node_modules/cspell-dict-scala/scala.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
        "typescript": { "name": "typescript", "path": "{}/cspell/node_modules/cspell/dist/dictionaries/typescript.txt.gz".format(d.getVar("STAGING_DATADIR_NATIVE"))},
    }

    _config_file = "cspell.json"

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
            bb.note("Running cspell for {}".format(k))
            write_config(_config, {k:v for k,v in _lang_configs.items() if k in _dicts.split(" ")}, _config_file)
            _t_args = _args + _check_files
            try:
                cmd_output += subprocess.check_output(_t_args, universal_newlines=True, stderr=subprocess.STDOUT)
            except subprocess.CalledProcessError as e:
                cmd_output += e.stdout or ""

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_cspell.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)
    with open(result_raw_file, "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/cspell.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_cspell(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "cspell")
}

SCA_DEPLOY_TASK = "do_sca_deploy_cspell"

python do_sca_deploy_cspell() {
    sca_conv_deploy(d, "cspell", "txt")
}

addtask do_sca_cspell before do_install after do_compile
addtask do_sca_deploy_cspell before do_package after do_sca_cspell

DEPENDS += "cspell-native sca-recipe-cspell-rules-native"
