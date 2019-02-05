## Configuration for static code analysis on image-level

inherit sca-global

SCA_PACKAGE_LICENSE_FILTER = "CLOSED"
SCA_ENABLED_MODULES ?= "shellcheck pylint"
SCA_SOURCES_DIR ?= "${IMAGE_ROOTFS}"

SCA_MODE = "image"

def sca_on_image_init(d):
    import bb
    from bb.parse.parse_py import BBHandler
    for item in d.getVar("SCA_ENABLED_MODULES").split(" "):
        bb.note("Using SCA Module {}".format(item))
        BBHandler.inherit("sca-{}-image".format(item), "sca-on-image", 1, d)