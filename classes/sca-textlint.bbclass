inherit sca-conv-checkstyle-textlint
inherit sca-license-filter
inherit sca-helper

SCA_TEXTLINT_RULES ?= "textlint-rule-no-todo textlint-rule-no-start-duplicated-conjunction \
                       textlint-rule-max-number-of-lines textlint-rule-max-comma \
                       textlint-rule-no-exclamation-question-mark textlint-rule-ng-word \
                       textlint-rule-no-dead-link textlint-rule-no-empty-section \
                       textlint-rule-unexpanded-acronym textlint-rule-alex \
                       textlint-rule-write-good textlint-rule-rousseau \
                       textlint-rule-en-max-word-count textlint-rule-date-weekday-mismatch \
                       textlint-rule-terminology textlint-rule-period-in-list-item \
                       textlint-rule-no-nfd  textlint-rule-no-surrogate-pair \
                       textlint-rule-abbr-within-parentheses textlint-rule-common-misspellings \
                       textlint-rule-ginger textlint-rule-apostrophe textlint-rule-diacritics \
                       textlint-rule-stop-words textlint-rule-en-capitalization"
SCA_TEXTLINT_ONLINE ?= "1"

python do_prepare_recipe_sysroot_append() {
    import glob
    import os

    ## Rewrite all of the packages-paths if we have to
    for item in glob.glob(os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "textlint") + "/**/package.json", recursive=True):
        content = ""
        with open(item, "r") as i:
            content = i.read().replace("%SYSROOT%", d.getVar("STAGING_DATADIR_NATIVE"))
        with open(item, "w") as o:
            o.write(content)
}

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

python do_sca_textlint() {
    import os
    import subprocess
    import json

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_SHELLCHECK_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_SHELLCHECK_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "textlint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "textlint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    _config = {
        "filters": { "textlint-filter-rule-comments": True },
        "plugins": [
            "html"
        ],
        "rules": {

        }
    }

    _online_rules = []
    with open(os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "textlint/online-rules.json")) as i:
        _online_rules = json.load(i)

    _config_file = os.path.join(d.getVar("T"), "textlint_config.json")
    with open(_config_file, "w") as o:
        for _rule in clean_split(d, "SCA_TEXTLINT_RULES"):
            if _rule in _online_rules:
                if d.getVar("SCA_TEXTLINT_ONLINE") == "1":
                    _config["rules"][_rule] = True
            else:
                _config["rules"][_rule] = True
        json.dump(_config, o)

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_textlint.json")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)

    _args = [os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "textlint", "node_modules", ".bin", "textlint")]
    _args += ["-c", _config_file]
    _args += ["--no-color"]
    _args += ["-f", "json"]
    _args += ["-o", result_raw_file]
    _args += [d.getVar("SCA_SOURCES_DIR")]

    cmd_output = ""
    try:
        cmd_output += subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        cmd_output += e.stdout or ""

    xml_output = do_sca_conv_textlint(d)
    result_file = os.path.join(d.getVar("T"), "sca_checkstyle_textlint.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    with open(result_file, "w") as o:
        o.write(xml_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "ShellCheck.", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings) and should_emit_to_console(d):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors) and should_emit_to_console(d):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatals):
        bb.build.exec_func(d.getVar("SCA_DEPLOY_TASK"), d)
        bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

SCA_DEPLOY_TASK = "do_sca_deploy_textlint"

python do_sca_deploy_textlint() {
    import os
    import shutil

    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "textlint", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "textlint", "checkstyle"), exist_ok=True)

    import os
    
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "textlint", "raw", "{}-{}.json".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "textlint", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_textlint.json")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_textlint.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_textlint before do_install after do_compile
addtask do_sca_deploy_textlint before do_package after do_sca_textlint

DEPENDS += "nodejs-native textlint-native sca-recipe-textlint-rules-native"
