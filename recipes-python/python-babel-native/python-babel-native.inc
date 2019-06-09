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
