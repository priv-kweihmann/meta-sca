SUMMARY = "Internationalization utilities"
HOMEPAGE = "http://babel.pocoo.org/en/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1b3f4650099e6d6a73e5a7fc8774ff18"

DEPENDS += "\
    nativesdk-python3 \
    nativesdk-python3-pytz \
"

PYPI_PACKAGE = "Babel"

SRC_URI[md5sum] = "9ee7784fd452d456206ecd3a12694010"
SRC_URI[sha256sum] = "5ef4b3226b0180dedded4229651c8b0e1a3a6a2837d45a073272f313e4cf97f6"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3 \
    nativesdk-python3-pytz \
"
