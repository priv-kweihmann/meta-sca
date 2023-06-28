## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## This class provides the configuration for blocklisting modules from certain recipes
## All configuration is described through space-separated regular expression
SCA_BLOCKLIST ?= ".*-native .*-cross clang"
SCA_BLOCKLIST_bandit ?= "linux-.*"
SCA_BLOCKLIST_bashate ?= ""
SCA_BLOCKLIST_bitbake ?= ""
SCA_BLOCKLIST_cbmc ?= "linux-.* busybox"
SCA_BLOCKLIST_checkbashism ?= ""
SCA_BLOCKLIST_cmake ?= ""
SCA_BLOCKLIST_cppcheck ?= "linux-.*"
SCA_BLOCKLIST_cpplint ?= "linux-.*"
SCA_BLOCKLIST_cvecheck ?= ""
SCA_BLOCKLIST_darglint ?= ""
SCA_BLOCKLIST_dennis ?= "linux-.*"
SCA_BLOCKLIST_detectsecrets ?= "linux-.*"
SCA_BLOCKLIST_flake8 ?= ""
SCA_BLOCKLIST_flawfinder ?= ""
SCA_BLOCKLIST_flint ?= "linux-.*"
SCA_BLOCKLIST_gcc ?= ""
SCA_BLOCKLIST_golint ?= "openssh"
SCA_BLOCKLIST_it ?= ""
SCA_BLOCKLIST_jsonlint ?= ""
SCA_BLOCKLIST_kconfighard ?= ""
SCA_BLOCKLIST_licensecheck ?= "busybox openssh"
SCA_BLOCKLIST_looong ?= "linux-.*"
SCA_BLOCKLIST_msgcheck ?= ""
SCA_BLOCKLIST_multimetric ?= ""
SCA_BLOCKLIST_mypy ?= "linux-.*"
SCA_BLOCKLIST_oclint ?= "linux-.*"
SCA_BLOCKLIST_oelint ?= ""
SCA_BLOCKLIST_perl ?= ""
SCA_BLOCKLIST_perlcritic ?= ""
SCA_BLOCKLIST_pkgqaenc ?= ""
SCA_BLOCKLIST_pscan ?= ""
SCA_BLOCKLIST_pylint ?= "linux-.*"
SCA_BLOCKLIST_pyright ?= ""
SCA_BLOCKLIST_pysymcheck ?= ""
SCA_BLOCKLIST_rats ?= ""
SCA_BLOCKLIST_revive ?= "openssh"
SCA_BLOCKLIST_scancode ?= ""
SCA_BLOCKLIST_setuptoolslint ?= ""
SCA_BLOCKLIST_shellcheck ?= ""
SCA_BLOCKLIST_slick ?= "openssh"
SCA_BLOCKLIST_sparse ?= ""
SCA_BLOCKLIST_stank ?= "openssh"
SCA_BLOCKLIST_systemdlint ?= ""
SCA_BLOCKLIST_tlv ?= "linux-.* busybox openssh"
SCA_BLOCKLIST_tscanscode ?= "linux-.*"
SCA_BLOCKLIST_vulture ?= ""
SCA_BLOCKLIST_xmllint ?= ""
SCA_BLOCKLIST_yamllint ?= ""

# insert a renamed copy of intersect_lists from sca-helpers
# to avoid inclusing helpers module too early
# as this pulls in additional dependencies even for
# modules that shouldn't be touched
def _intersect_lists_rpl(d, l1, l2):
    if isinstance(l1, str):
        l1 = [x for x in l1.split(" ") if x]
    if isinstance(l2, str):
        l2 = [x for x in l2.split(" ") if x]
    return sorted(list(set(l1).intersection(l2)))

def sca_is_module_blocklisted(d, tool=None):
    import re
    pn = d.getVar("PN")
    matches = [x for x in (d.getVar("SCA_BLOCKLIST") or "").split(" ") if x]
    if tool:
        matches += [x for x in (d.getVar("SCA_BLOCKLIST_{}".format(tool.replace("-", "_"))) or "").split(" ") if x]
    _pns = [re.match(x, pn) for x in matches]
    _def_deps = [x for x in d.getVar("BASE_DEFAULT_DEPS").split(" ")]
    _prov = [x for x in d.getVar("PROVIDES").split(" ")]
    return any(_pns + _intersect_lists_rpl(d, _def_deps, _prov))
