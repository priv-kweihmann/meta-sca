SUMMARY = "Powerful and Pythonic XML processing library combining libxml2/libxslt with the ElementTree API"
HOMEPAGE = "https://github.com/lxml/lxml"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSES.txt;md5=e4c045ebad958ead4b48008f70838403"

DEPENDS += "\
            libxml2-native \
            libxslt-native \
            python3-cython-native \
           "

PYPI_PACKAGE = "lxml"

SRC_URI[md5sum] = "aa84a7ce47581b43cb827145340505c6"
SRC_URI[sha256sum] = "2455cfaeb7ac70338b3257f41e21f0724f4b5b0c0e7702da67ee6c3640835b67"

inherit pkgconfig
inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-libxml2 \
    nativesdk-libxslt \
    nativesdk-python3-cython \
"
