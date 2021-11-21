SUMMARY = "Powerful and Pythonic XML processing library combining libxml2/libxslt with the ElementTree API"
HOMEPAGE = "https://github.com/lxml/lxml"

DEFAULT_PREFERENCE = "-1"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSES.txt;md5=e4c045ebad958ead4b48008f70838403"

DEPENDS += "\
            libxml2-native \
            libxslt-native \
            python3-cython-native \
           "

PYPI_PACKAGE = "lxml"

SRC_URI[md5sum] = "1e5354ce400123658b9e1079508fca52"
SRC_URI[sha256sum] = "daf9bd1fee31f1c7a5928b3e1059e09a8d683ea58fb3ffc773b6c88cb8d1399c"

inherit pkgconfig
inherit pypi
inherit setuptools3
inherit native
