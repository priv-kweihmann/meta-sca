## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Configuration for static code analysis on recipe-level

inherit sca-global
inherit sca-helper
inherit sca-file-filter
inherit sca-blacklist

SCA_ENABLED_MODULES_RECIPE ?= "\
                            alexkohler \
                            ansiblelint \
                            bandit \
                            bashate \
                            bitbake \
                            cbmc \
                            checkbashism \
                            clang \
                            cppcheck \
                            cpplint \
                            cqmetrics \
                            cspell \
                            cvecheck \
                            darglint \
                            dennis \
                            detectsecrets \
                            eslint \
                            flake8 \
                            flawfinder \
                            flint \
                            gcc \
                            golint \
                            gosec \
                            govet \
                            htmlhint \
                            ikos \
                            jsonlint \
                            kconfighard \
                            looong \
                            luacheck \
                            npmaudit \
                            msgcheck \
                            mypy \
                            oelint \
                            phan \
                            phpcodefixer \
                            phpcodesniffer \
                            phpmd \
                            phpsecaudit \
                            phpstan \
                            progpilot \
                            proselint \
                            pscan \
                            pyfindinjection \
                            pylint \
                            pyright \
                            pysymcheck \
                            pytype \
                            radon \
                            rats \
                            retire \
                            revive \
                            ropgadget \
                            safety \
                            score \
                            shellcheck \
                            slick \
                            sparse \
                            splint \
                            standard \
                            stank \
                            stylelint \
                            textlint \
                            tlv \
                            tscancode \
                            vulture \
                            wotan \
                            xmllint \
                            yamllint \
                            zrd \
                            "
SCA_SOURCES_DIR ?= "${B}"

SCA_MODE = "recipe"
SCA_MODE_UPPER = "${@d.getVar('SCA_MODE').upper()}"

def sca_on_recipe_init(d):
    import bb
    from bb.parse.parse_py import BBHandler
    enabledModules = []
    for item in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        if sca_is_module_blacklisted(d, item) or not any(sca_filter_by_license(d)):
            continue
        okay = False
        try:
            BBHandler.inherit("sca-{}".format(item), "sca-on-recipe", 1, d)
            func = "sca-{}-init".format(item).replace("-", "_")
            if d.getVar(func, False) is not None:
                bb.build.exec_func(func, d, **get_bb_exec_ext_parameter_support(d))
            okay = True
        except bb.parse.ParseError:
            pass
        try: 
            ## In case there is a split between image/recipe modules
            BBHandler.inherit("sca-{}-recipe".format(item), "sca-on-recipe", 1, d)
            func = "sca-{}-init".format(item).replace("-", "_")
            if d.getVar(func, False) is not None:
                bb.build.exec_func(func, d, **get_bb_exec_ext_parameter_support(d))
            okay = True
        except bb.parse.ParseError:
            pass
        if okay:
            enabledModules.append(item)
    if d.getVar("SCA_ENABLE_IMAGE_SUMMARY") == "1":
        BBHandler.inherit("sca-{}-recipe".format("bestof"), "sca-on-recipe", 1, d)
        func = "sca-{}-init".format("bestof").replace("-", "_")
        if d.getVar(func, False) is not None:
            bb.build.exec_func(func, d, **get_bb_exec_ext_parameter_support(d))
    if any(enabledModules):
        if d.getVar("SCA_VERBOSE_OUTPUT") == "1":
            bb.note("Using SCA Module(s) {}".format(",".join(sorted(enabledModules))))
