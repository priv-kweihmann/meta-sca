SUMMARY = "Internationalization utilities"
HOMEPAGE = "http://babel.pocoo.org/en/latest/"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=22a580b27e4ebf9689e466b63aedeb7f"

DEPENDS += "${PYTHON_PN}-native \
            ${PYTHON_PN}-pytz-native"

PYPI_PACKAGE = "Babel"

SRC_URI[md5sum] = "bfc803874aa71e9e9bd54bdd1ce944ba"
SRC_URI[sha256sum] = "da031ab54472314f210b0adcff1588ee5d1d1d0ba4dbd07b94dba82bde791e05"

inherit pypi
inherit native
inherit setuptools3
