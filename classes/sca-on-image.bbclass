## Configuration for static code analysis on image-level

inherit sca-global
inherit sca-helper
inherit sca-file-filter
inherit sca-blackllist

SCA_PACKAGE_LICENSE_FILTER = "CLOSED"
SCA_ENABLED_MODULES ?= "\
                        ansible \
                        ansiblelint \
                        bandit \
                        bitbake \
                        detectsecrets \
                        eslint \
                        gixy \
                        htmlhint \
                        jsonlint \
                        oelint \
                        proselint \
                        pyfindinjection \
                        pylint \
                        shellcheck \
                        standard \
                        stylelint \
                        systemdlint \
                        xmllint \
                        yamllint \
                        "
SCA_SOURCES_DIR ?= "${IMAGE_ROOTFS}"

SCA_MODE = "image"

def sca_on_image_init(d):
    import bb
    from bb.parse.parse_py import BBHandler
    enabledModules = []
    for item in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        if sca_is_module_blacklisted(d, item):
            continue
        BBHandler.inherit("sca-{}-image".format(item), "sca-on-image", 1, d)
        func = "sca-{}-init".format(item).replace("-", "_")
        if d.getVar(func, False) is not None:
            bb.build.exec_func(func, d, pythonexception=True)
        okay = True
        enabledModules.append(item)
    if any(enabledModules):
        bb.note("Using SCA Module(s) {}".format(",".join(sorted(enabledModules))))
        ## inherit license-helper class
        BBHandler.inherit("sca-license-image-helper".format(item), "sca-on-image", 1, d)
        if d.getVar("SCA_ENABLE_IMAGE_SUMMARY") == "1":
            BBHandler.inherit("sca-{}-image".format("bestof"), "sca-on-recipe", 1, d)
            func = "sca-{}-init".format("bestof").replace("-", "_")
            if d.getVar(func, False) is not None:
                bb.build.exec_func(func, d, pythonexception=True)
        if d.getVar("SCA_ENABLE_IMAGE_SUMMARY") == "1":
            BBHandler.inherit("sca-{}".format("image-summary"), "sca-on-image", 1, d)
            func = "sca-{}-init".format("image-summary").replace("-", "_")
            if d.getVar(func, False) is not None:
                bb.build.exec_func(func, d, pythonexception=True)