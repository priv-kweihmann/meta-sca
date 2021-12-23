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

SRC_URI[md5sum] = "7761ed3842697b4e1de83e47ee2242d8"
SRC_URI[sha256sum] = "a1613838aa6b89af4ba10a0f3a972836128801ed008078f8c1244e65958f1b24"

inherit pkgconfig
inherit pypi
inherit setuptools3
inherit native
