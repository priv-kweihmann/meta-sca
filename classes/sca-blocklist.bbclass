## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## This class provides the configuration for blocklisting modules from certain recipes
## All configuration is described through space-separated regular expression
SCA_BLOCKLIST ?= ".*-native .*-cross clang"
SCA_BLOCKLIST[bandit] = "linux-.*"
SCA_BLOCKLIST[bashate] = ""
SCA_BLOCKLIST[bitbake] = ""
SCA_BLOCKLIST[cbmc] = "linux-.* busybox"
SCA_BLOCKLIST[checkbashism] = ""
SCA_BLOCKLIST[cmake] = ""
SCA_BLOCKLIST[cppcheck] = "linux-.*"
SCA_BLOCKLIST[cpplint] = "linux-.*"
SCA_BLOCKLIST[cvecheck] = ""
SCA_BLOCKLIST[darglint] = ""
SCA_BLOCKLIST[dennis] = "linux-.*"
SCA_BLOCKLIST[detectsecrets] = "linux-.*"
SCA_BLOCKLIST[flake8] = ""
SCA_BLOCKLIST[flawfinder] = ""
SCA_BLOCKLIST[flint] = "linux-.*"
SCA_BLOCKLIST[gcc] = ""
SCA_BLOCKLIST[golint] = "openssh"
SCA_BLOCKLIST[jsonlint] = ""
SCA_BLOCKLIST[kconfighard] = ""
SCA_BLOCKLIST[licensecheck] = "busybox openssh"
SCA_BLOCKLIST[looong] = "linux-.*"
SCA_BLOCKLIST[msgcheck] = ""
SCA_BLOCKLIST[multimetric] = ""
SCA_BLOCKLIST[mypy] = "linux-.*"
SCA_BLOCKLIST[oclint] = "linux-.*"
SCA_BLOCKLIST[oelint] = ""
SCA_BLOCKLIST[perl] = ""
SCA_BLOCKLIST[perlcritic] = ""
SCA_BLOCKLIST[pkgqaenc] = ""
SCA_BLOCKLIST[pscan] = ""
SCA_BLOCKLIST[pylint] = "linux-.*"
SCA_BLOCKLIST[pyright] = ""
SCA_BLOCKLIST[pysymcheck] = ""
SCA_BLOCKLIST[rats] = ""
SCA_BLOCKLIST[revive] = "openssh"
SCA_BLOCKLIST[ruff] = ""
SCA_BLOCKLIST[scancode] = ""
SCA_BLOCKLIST[setuptoolslint] = ""
SCA_BLOCKLIST[shellcheck] = ""
SCA_BLOCKLIST[slick] = "openssh"
SCA_BLOCKLIST[sparse] = ""
SCA_BLOCKLIST[stank] = "openssh"
SCA_BLOCKLIST[systemdlint] = "nativesdk-python3-systemdlint"
SCA_BLOCKLIST[tlv] = "linux-.* busybox openssh"
SCA_BLOCKLIST[tscanscode] = "linux-.*"
SCA_BLOCKLIST[vulture] = ""
SCA_BLOCKLIST[xmllint] = ""
SCA_BLOCKLIST[yamllint] = ""

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
        matches += [x for x in (d.getVarFlag("SCA_BLOCKLIST", tool.replace("-", "_")) or "").split(" ") if x]
    _pns = [re.match(x, pn) for x in matches]
    _def_deps = [x for x in d.getVar("BASE_DEFAULT_DEPS").split(" ")]
    _prov = [x for x in d.getVar("PROVIDES").split(" ")]
    return any(_pns + _intersect_lists_rpl(d, _def_deps, _prov))
