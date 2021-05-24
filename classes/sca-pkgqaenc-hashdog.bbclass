## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

SCA_PKGQAENC_HASHDOG_CULP ?= "DATETIME"
SCA_PKGQAENC_HASHDOG_EXCL ?= "${BB_HASHCONFIG_WHITELIST} ${BB_HASHBASE_WHITELIST} prefix prefix_native"

inherit sca-pkgqaenc-helper

def do_sca_pkgqaenc_hashdog_get_varset(d, varname, res={}):
    for x in d.expandWithRefs(d.getVar(varname, False), varname).references or set():
        res[x] = d.getVar(x, False)
        do_sca_pkgqaenc_hashdog_get_varset(d, x, res=res)
    return res

def do_sca_pkgqaenc_hashdog(d):
    import os
    _out = ""
    _glob_excludes = set((d.expand("${SCA_PKGQAENC_HASHDOG_EXCL}") or "").split())
    _glob_culprits = set((d.expand("${SCA_PKGQAENC_HASHDOG_CULP}") or "").split())
    for k in d.keys():
        _flags = d.getVarFlags(k) or []
        if "func" in _flags and k.startswith("do_"):
            res = do_sca_pkgqaenc_hashdog_get_varset(d, k, {})
            _excludes = set(_glob_excludes)
            if "vardepsexclude" in _flags:
                _excludes.update((d.getVarFlag(k, "vardepsexclude") or "").split())
            for _k, _v in res.items():
                _hit = _k in _glob_culprits
                if (_v or "").startswith("/") and os.path.exists(d.getVar(_k)):
                    _hit |= True
                if _hit and _k not in _excludes:
                    _out += do_sca_pkgqaenc_warning("pkgqaenc.pkgqaenc.notsstatesafe", d.getVar("FILE"),
                        "Task '{}' uses {} with the value of '{}' - this could lead to sstate corruptions." \
                        "Consider adding '{}[vardepsexclude] += \"{}\"' to the recipe".format(k, _k, _v, k, _k))
    return _out