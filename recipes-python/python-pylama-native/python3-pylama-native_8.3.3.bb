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

SRC_URI[md5sum] = "92e766572042e08293c5ba033985e64c"
SRC_URI[sha256sum] = "0566eb150cc92a676cfa119cd98e8b8ab88da3f7ff8d34a5c6d2f3ad3ca92962"

inherit pypi
inherit setuptools3
inherit native

do_install:append() {
    ## This otherwise collides with other modules
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests/
}
