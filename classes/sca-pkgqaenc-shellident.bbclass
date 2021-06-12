## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

inherit sca-helper
inherit sca-pkgqaenc-helper

SCA_PKGQAENC_SHELLIDENT_SHELLS ?= "bash sh ksh"
SCA_PKGQAENC_SHELLIDENT_SHELLS[bash] = ".*/bash"
SCA_PKGQAENC_SHELLIDENT_SHELLS[sh] = ".*/sh"
SCA_PKGQAENC_SHELLIDENT_SHELLS[ksh] = ".*/ksh"

DEPENDS += "python3-shellexeclist-native"

def do_sca_pkgqaenc_shelllist(d, package):
    res = ""
    used_bins = {}
    _args = ["shellexeclist"]
    for shell in clean_split(d, "SCA_PKGQAENC_SHELLIDENT_SHELLS"):
        _files = get_files_by_shebang(d, d.expand("${{PKGDEST}}/{}".format(package)), 
                                      d.getVarFlag("SCA_PKGQAENC_SHELLIDENT_SHELLS", shell),
                                      sca_filter_files(d, d.expand("${{PKGDEST}}/{}".format(package)),
                                      clean_split(d, "SCA_FILE_FILTER_EXTRA")))
        _targs = ["--forceshell", shell]
        for f in _files:
            used_bins[f] = set([x for x in exec_wrap_check_output(d, _args + _targs, [f]).split("\n") if x])

    _pkg_in_rdepends = clean_split(d, "RDEPENDS_{}".format(package))
    if package != d.getVar("PN"):
        # add implicit dependency on base package
        _pkg_in_rdepends += [d.getVar("PN")]

    for file, bins in used_bins.items():
        for bin in bins:
            pkgs = do_sca_pkgqaenc_pkg_for_file(d, bin)
            if pkgs:
                if not any(x in _pkg_in_rdepends for x in pkgs):
                    if len(pkgs) > 1:
                        prov_string = "one of {}".format(",".join(sorted(pkgs)))
                    else:
                        prov_string = ",".join(pkgs)
                    res += do_sca_pkgqaenc_warning("pkgqaenc.pkgqaenc.missingprodiver", file, 
                                                "Package {pkg} uses {bin}, that requires {prov} set in RDEPENDS_{pkg}".format(
                                                    bin=bin, pkg=package, prov=prov_string))
            elif not do_sca_pkgqaenc_is_provided_by_self(d, bin, package):
                res += do_sca_pkgqaenc_warning("pkgqaenc.pkgqaenc.missingprodiver", file, 
                                                "Package {pkg} uses {bin}, but no provider for this file can be found".format(
                                                    bin=bin, pkg=package))
    return res