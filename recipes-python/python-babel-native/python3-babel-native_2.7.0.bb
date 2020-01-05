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

SRC_URI[md5sum] = "83c158b7dae9135750a7cf204e6e2eea"
SRC_URI[sha256sum] = "e86135ae101e31e2c8ec20a4e0c5220f4eed12487d5cf3f78be7e98d3a57fc28"
