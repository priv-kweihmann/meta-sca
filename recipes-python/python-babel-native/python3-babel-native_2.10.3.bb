SUMMARY = "Internationalization utilities"
HOMEPAGE = "http://babel.pocoo.org/en/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1b3f4650099e6d6a73e5a7fc8774ff18"

DEPENDS += "python3-native \
            python3-pytz-native"

PYPI_PACKAGE = "Babel"

SRC_URI[md5sum] = "809ed21b4f643167d0f6f5e936bbfbdc"
SRC_URI[sha256sum] = "7614553711ee97490f732126dc077f8d0ae084ebc6a96e23db1482afabdb2c51"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3 \
    nativesdk-python3-pytz \
"
