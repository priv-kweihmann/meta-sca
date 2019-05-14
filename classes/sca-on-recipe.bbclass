## Configuration for static code analysis on recipe-level

inherit sca-global
inherit sca-helper
inherit sca-file-filter
inherit sca-blackllist

SCA_ENABLED_MODULES ?= "\
                        ansiblelint \
                        bandit \
                        bitbake \
                        clang \
                        cppcheck \
                        cpplint \
                        cspell \
                        cve-check \
                        dennis \
                        detectsecrets \
                        eslint \
                        flint \
                        gcc \
                        htmlhint \
                        jsonlint \
                        kconfighard \
                        oclint \
                        oelint \
                        proselint \
                        pyfindinjection \
                        pylint \
                        pysymcheck \
                        pytype \
                        rats \
                        ropgadget \
                        shellcheck \
                        standard \
                        stylelint \
                        textlint \
                        tscancode \
                        xmllint \
                        yamllint \
                        zrd \
                        "
SCA_SOURCES_DIR ?= "${B}"

SCA_MODE = "recipe"

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
                bb.build.exec_func(func, d, pythonexception=True)
            okay = True
        except bb.parse.ParseError:
            pass
        try: 
            ## In case there is a split between image/recipe modules
            BBHandler.inherit("sca-{}-recipe".format(item), "sca-on-recipe", 1, d)
            func = "sca-{}-init".format(item).replace("-", "_")
            if d.getVar(func, False) is not None:
                bb.build.exec_func(func, d, pythonexception=True)
            okay = True
        except bb.parse.ParseError:
            pass
        if okay:
            enabledModules.append(item)
    if d.getVar("SCA_ENABLE_IMAGE_SUMMARY") == "1":
        BBHandler.inherit("sca-{}-recipe".format("bestof"), "sca-on-recipe", 1, d)
        func = "sca-{}-init".format("bestof").replace("-", "_")
        if d.getVar(func, False) is not None:
            bb.build.exec_func(func, d, pythonexception=True)
    if any(enabledModules):
        bb.note("Using SCA Module(s) {}".format(",".join(sorted(enabledModules))))
