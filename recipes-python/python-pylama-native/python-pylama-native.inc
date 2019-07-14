SUMMARY = "Simple Python style checker in one Python file"
DESCRIPTION = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

PYPI_PACKAGE = "pylama"

DEPENDS += "\
            ${PYTHON_PN}-mccabe-native \
            ${PYTHON_PN}-pycodestyle-native \
            ${PYTHON_PN}-pydocstyle-native \
            ${PYTHON_PN}-pyflakes-native \
            "

inherit pypi
inherit native

do_install_append() {
    ## This otherwise collides with other modules
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests/
}