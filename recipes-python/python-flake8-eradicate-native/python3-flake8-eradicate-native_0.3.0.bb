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

SRC_URI[md5sum] = "9e1e19ed6bc3c664491db5f0a44a991d"
SRC_URI[sha256sum] = "d0b3d283d85079917acbfe39b9d637385cd82cba3ae3d76c1278c07ddcf0d9b9"
