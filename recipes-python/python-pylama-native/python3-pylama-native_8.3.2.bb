SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

DEFAULT_PREFERENCE = "-1"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e21c6f4c612498422aedaf3dd409de0"

DEPENDS += "\
            python3-mccabe-native \
            python3-pycodestyle-native \
            python3-pydocstyle-native \
            python3-pyflakes-native \
            "

PYPI_PACKAGE = "pylama"

SRC_URI[md5sum] = "6a6cd055004ef4a8ce8f89abe474d354"
SRC_URI[sha256sum] = "30d2517e708b4dcb682ae3a842373528c557e05ae9cf97fdf10948b08276afb2"

inherit pypi
inherit setuptools3
inherit native

do_install:append() {
    ## This otherwise collides with other modules
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests/
}
