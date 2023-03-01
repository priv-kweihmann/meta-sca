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

SRC_URI[md5sum] = "9ac7d8aac42c17a1e6d922017058d2c8"
SRC_URI[sha256sum] = "cc2d99999cd01d44420ae725a21c9e3711b3aadc7976d6147f622d8581963455"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3 \
    nativesdk-python3-pytz \
"
