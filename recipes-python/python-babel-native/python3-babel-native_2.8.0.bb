SUMMARY = "Internationalization utilities"
DESCRIPTION = "Internationalization utilities"
HOMEPAGE = "http://babel.pocoo.org/en/latest/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=942469df9305abb1c59e95f778310384"

DEPENDS += "${PYTHON_PN}-native \
            ${PYTHON_PN}-pytz-native"

PYPI_PACKAGE = "Babel"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "6fad9772e75421969ddb41975483abdf"
SRC_URI[sha256sum] = "1aac2ae2d0d8ea368fa90906567f5c08463d98ade155c0c4bfedd6a0f7160e38"
