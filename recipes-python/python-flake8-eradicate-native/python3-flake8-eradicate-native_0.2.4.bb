SUMMARY = "Flake8 plugin to find commented out or dead code"
DESCRIPTION = "Flake8 plugin to find commented out or dead code"
HOMEPAGE = "https://github.com/sobolevn/flake8-eradicate"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=268c5fd9e64a788932af10a988ab35c4"

PYPI_PACKAGE = "flake8-eradicate"

DEPENDS += "\
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-eradicate-native \
            ${PYTHON_PN}-flake8-native \
            "

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "b18f3b7d88c21b911ae85d40399d2efd"
SRC_URI[sha256sum] = "b693e9dfe6da42dbc7fb75af8486495b9414d1ab0372d15efcf85a2ac85fd368"
