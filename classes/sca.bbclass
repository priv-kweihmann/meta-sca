## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

## Main entry point for static code analysis
## You can easily add this to the a global
## inherit on local.conf level or put it in the distribution config

## Settings can be found in sca-global
inherit sca-global
inherit sca-blacklist

def sca_files_part_of_unspared_layer(d, files):
    import re
    import os
    _layer = []
    for x in d.getVar("SCA_SPARE_LAYER").split(" "):
        if not x:
            continue
        _tmp = d.getVar("BBFILE_PATTERN_{}".format(x))
        if _tmp:
            _tmp = _tmp.lstrip("^").rstrip("/") or ""
            _tmp = os.path.abspath(_tmp)
            _layer.append("^{}/".format(_tmp))
    _layer += [x for x in d.getVar("SCA_SPARE_DIRS").split(" ") if x]
    if not any(_layer):
        return files
    res = set()
    for f in files:
        if not any([True for x in _layer if re.match(x, os.path.abspath(f))]):
            res.add(os.path.abspath(f))
    return list(res)

def sca_mask_vars(d):
    # instead on tuning each any every function manually
    # patch them here
    for e in d.keys():
        if d.getVarFlag(e, 'task'):
            d.appendVarFlag(e, "vardepsexclude", " " + d.getVar("SCA_HASHEXCLUDE_VARS"))

def sca_force_run(d):
    _force_run = d.getVar("SCA_FORCE_RUN") != "0"
    if _force_run and bb.data.inherits_class('rm_work', d):
        bb.warn("You inherited 'rm_work', so enabling SCA_FORCE_RUN could slow down your build significantly")
    for e in d.keys():
        if d.getVarFlag(e, 'task') and e.startswith("do_sca_"):
            if not _force_run:
                d.delVarFlag(e, "nostamp")
            else:
                d.setVarFlag(e, "nostamp", "1")

addhandler sca_invoke_handler
sca_invoke_handler[eventmask] = "bb.event.RecipePreFinalise"
python sca_invoke_handler() {
    import bb
    import os
    from bb.parse.parse_py import BBHandler
    if bb.data.inherits_class('packagegroup', d):
        bb.debug(2, "Skip {} because of being a packagegroup, can't run SCA here".format(d.getVar("PN")))
        sca_mask_vars(d)
        return
    if d.getVar("SCA_SKIP_DEVTOOL") == "1":
        bb.debug(2, "Skip {} because of being under control of devtool".format(d.getVar("PN")))
        sca_mask_vars(d)
        return
    # Check if the file should be spared
    _files = [d.getVar("FILE")]
    if d.getVar("SCA_SPARE_IGNORE_BBAPPEND") != "1":
        _files += [x for x in bb.parse.get_file_depends(d).split(" ") if x and os.path.exists(x) and x.endswith(".bbappend")]
    _matches = sca_files_part_of_unspared_layer(d, _files)
    if not any(_matches):
        # none of the files are in the match list
        # which means that all should be spared
        # so we quit here
        sca_mask_vars(d)
        return
    if d.getVar("SCA_ENABLE") == "1" and not sca_is_module_blacklisted(d, ""):
        py2 = bb.data.inherits_class('pythonnative', d)
        if py2:
            # backup some value before invoking sca
            py2_PYTHON = d.getVar("PYTHON")
            py2_PYTHON_PN = d.getVar("PYTHON_PN")
            py2_PYTHON_BASEVERSION = d.getVar("PYTHON_BASEVERSION")
        if bb.data.inherits_class('image', d) and d.getVar("SCA_AUTO_INH_ON_IMAGE") == "1":
            BBHandler.inherit("sca-on-image", "sca", 1, d)
            sca_on_image_init(d)
        elif not bb.data.inherits_class('image', d) and d.getVar("SCA_AUTO_INH_ON_RECIPE") == "1":
            BBHandler.inherit("sca-on-recipe", "sca", 1, d)
            sca_on_recipe_init(d)
        if py2:
            # Readd the original values of python2 to avoid confusion
            d.setVar("PYTHON", py2_PYTHON)
            d.setVar("PYTHON_PN", py2_PYTHON_PN)
            d.setVar("PYTHON_BASEVERSION", py2_PYTHON_BASEVERSION)
    sca_mask_vars(d)
    sca_force_run(d)
}
