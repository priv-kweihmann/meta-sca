## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

## Main entry point for static code analysis
## You can easily add this to the a global
## inherit on local.conf level or put it in the distribution config

## Settings can be found in sca-global
inherit sca-global

addhandler sca_invoke_handler
sca_invoke_handler[eventmask] = "bb.event.RecipePreFinalise"
python sca_invoke_handler() {
    import bb
    import os
    import re
    from bb.parse.parse_py import BBHandler
    # Check if the file should be spared
    _layer = [d.getVar("BBFILE_PATTERN_{}".format(x)) or "" for x in d.getVar("SCA_SPARE_LAYER").split(" ") if x]
    _layer = [x for x in _layer if x]
    _dirs = [x for x in d.getVar("SCA_SPARE_DIRS").split(" ") if x]
    _files = [d.getVar("FILE")]
    if d.getVar("SCA_SPARE_IGNORE_BBAPPEND") != "1":
        _files += [x for x in bb.parse.get_file_depends(d).split(" ") if x and os.path.exists(x) and x.endswith(".bbappend")]
    _matches = []
    for f in _files:
        _matches += [f for x in _layer + _dirs if re.match(x, f)]
    if all([x in _matches for x in _files]):
        # all files are also in the match list
        # which means that all should be spared
        # so we quit here
        return
    if d.getVar("SCA_ENABLE") == "1":
        if d.getVar("IMAGE_INSTALL") and d.getVar("IMAGE_TYPES") and d.getVar("SCA_AUTO_INH_ON_IMAGE") == "1":
            BBHandler.inherit("sca-on-image", "sca", 1, d)
            sca_on_image_init(d)
        elif d.getVar("SCA_AUTO_INH_ON_RECIPE") == "1":
            BBHandler.inherit("sca-on-recipe", "sca", 1, d)
            sca_on_recipe_init(d)
}
