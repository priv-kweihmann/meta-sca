## This class provides the configuration for blacklisting modules from certain recipes
## All configuration is described through space-separated regular expression
SCA_BLACKLIST ?= ".*-native "
SCA_BLACKLIST_ansible ?= ""
SCA_BLACKLIST_bandit ?= "linux-.*"
SCA_BLACKLIST_bitbake ?= ""
SCA_BLACKLIST_clang ?= "linux-.*"
SCA_BLACKLIST_cppcheck ?= "linux-.*"
SCA_BLACKLIST_cpplint ?= "linux-.*"
SCA_BLACKLIST_cspell ?= "linux-.*"
SCA_BLACKLIST_cve_check ?= ""
SCA_BLACKLIST_dennis ?= ""
SCA_BLACKLIST_eslint ?= "linux-.*"
SCA_BLACKLIST_flint ?= "linux-.*"
SCA_BLACKLIST_gcc ?= ""
SCA_BLACKLIST_gixy ?= ""
SCA_BLACKLIST_jsonlint ?= ""
SCA_BLACKLIST_kconfighard ?= ""
SCA_BLACKLIST_oclint ?= "linux-.*"
SCA_BLACKLIST_oelint ?= ""
SCA_BLACKLIST_pylint ?= "linux-.*"
SCA_BLACKLIST_pysymcheck ?= ""
SCA_BLACKLIST_pytype ?= "linux-.*"
SCA_BLACKLIST_rats ?= ""
SCA_BLACKLIST_shellcheck ?= ""
SCA_BLACKLIST_systemdlint ?= ""
SCA_BLACKLIST_textlint ?= ""
SCA_BLACKLIST_tscanscode ?= "linux-.*"
SCA_BLACKLIST_xmllint ?= ""
SCA_BLACKLIST_yamllint ?= ""
SCA_BLACKLIST_zrd ?= ""

def sca_is_module_blacklisted(d, tool):
    import re
    pn = d.getVar("PN")
    matches = d.getVar("SCA_BLACKLIST") or ""
    matches += d.getVar("SCA_BLACKLIST_{}".format(tool.replace("-", "_"))) or ""
    matches = [x for x in matches.split(" ") if x]
    return any([re.match(x, pn) for x in matches])
