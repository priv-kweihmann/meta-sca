## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Main entry point for static code analysis
## You can easily add this to the a global
## inherit on local.conf level or put it in the distribution config

## Settings can be found in sca-global
inherit sca-global

python __anonymous() {
    import bb
    from bb.parse.parse_py import BBHandler
    if d.getVar("SCA_ENABLE") == "1":
        if d.getVar("IMAGE_INSTALL") and d.getVar("IMAGE_TYPES") and d.getVar("SCA_AUTO_INH_ON_IMAGE") == "1":
            BBHandler.inherit("sca-on-image", "sca", 1, d)
            sca_on_image_init(d)
        elif d.getVar("SCA_AUTO_INH_ON_RECIPE") == "1":
            BBHandler.inherit("sca-on-recipe", "sca", 1, d)
            sca_on_recipe_init(d)
}