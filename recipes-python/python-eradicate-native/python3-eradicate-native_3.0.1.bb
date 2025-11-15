SUMMARY = "Removes commented-out code"
HOMEPAGE = "https://github.com/myint/eradicate"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://eradicate.py;endline=21;md5=4665a3ee1ecb347243801ec86697f8a0"

PYPI_PACKAGE = "eradicate"

SRC_URI[md5sum] = "25aaf07a0cd0736bbe805c8af3d67473"
SRC_URI[sha256sum] = "c9cb7ef8e7e83c3fbd9806010e21089892bb649531c68875a555c7b5c978faa6"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-difflib \
"
