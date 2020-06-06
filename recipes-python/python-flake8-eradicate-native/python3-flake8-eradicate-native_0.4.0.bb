SUMMARY = "Flake8 plugin to find commented out or dead code"
HOMEPAGE = "https://github.com/sobolevn/flake8-eradicate"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=268c5fd9e64a788932af10a988ab35c4"

DEPENDS += "\
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-eradicate-native \
            ${PYTHON_PN}-flake8-native \
            "

PYPI_PACKAGE = "flake8-eradicate"

SRC_URI[md5sum] = "7ef2bbf300155e5002b45c5eb0da5542"
SRC_URI[sha256sum] = "be5ea4521dfd4cb76837635f9ace57e12a7336c4b82054c99fd0394c00eef8ce"

inherit pypi
inherit native
inherit setuptools3
