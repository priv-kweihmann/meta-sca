## Configuration for static code analysis on recipe-level

inherit sca-global
inherit sca-license-filter

SCA_ENABLED_MODULES ?= "gcc cpplint cppcheck pylint shellcheck"
SCA_SOURCES_DIR ?= "${B}"

SCA_MODE = "recipe"

def sca_on_recipe_init(d):
    import bb
    from bb.parse.parse_py import BBHandler
    pn = d.getVar("PN")
    if pn.endswith("-native") or pn.endswith("-nativesdk"):
        ## Do not inherit on native or SDK targets
        return
    if not any(sca_filter_by_license(d, d.getVar("SCA_AUTO_LICENSE_FILTER").split(" "))):
        ## do not apply when license is not matching
        return
    for item in d.getVar("SCA_ENABLED_MODULES").split(" "):
        try:
            BBHandler.inherit("sca-{}".format(item), "sca-on-recipe", 1, d)
        except bb.parse.ParseError:
            pass
        try: 
            ## In case there is a split between image/recipe modules
            BBHandler.inherit("sca-{}-recipe".format(item), "sca-on-recipe", 1, d)
        except bb.parse.ParseError:
            pass
