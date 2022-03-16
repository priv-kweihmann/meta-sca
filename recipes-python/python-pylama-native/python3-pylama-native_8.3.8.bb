SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e21c6f4c612498422aedaf3dd409de0"

DEPENDS += "\
            python3-mccabe-native \
            python3-pycodestyle-native \
            python3-pydocstyle-native \
            python3-pyflakes-native \
            "

PYPI_PACKAGE = "pylama"

SRC_URI[md5sum] = "d0a18c372133aa77f73382d691fa51c8"
SRC_URI[sha256sum] = "2dd852fe9312ea6012466cf17ff179668fc3d2716856fcfaaee8ce7876d83620"

inherit pypi
inherit setuptools3
inherit native

do_install:append() {
    ## This otherwise collides with other modules
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests/
}
