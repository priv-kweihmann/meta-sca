SUMMARY = "Removes commented-out code"
HOMEPAGE = "https://github.com/myint/eradicate"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://eradicate.py;endline=21;md5=4665a3ee1ecb347243801ec86697f8a0"

PYPI_PACKAGE = "eradicate"

SRC_URI[md5sum] = "76e292925026a183f8a74507f913aebc"
SRC_URI[sha256sum] = "b237d9f2309b181035d2a87b24385b4f11ab7bb858b75bff496964b5f453aa77"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-difflib \
"
