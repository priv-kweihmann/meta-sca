SUMMARY = "Python @deprecated decorator to deprecate old classes, functions or methods"
HOMEPAGE = "https://github.com/tantale/deprecated"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=44288e26f4896bdab14072d4fa35ff01"

DEPENDS += "\
            python3-wrapt-native \
           "

PYPI_PACKAGE = "Deprecated"

SRC_URI[md5sum] = "5b0ee42dfda7b482fcf8fc3df823454c"
SRC_URI[sha256sum] = "6d2de2de7931a968874481ef30208fd4e08da39177d61d3d4ebdf4366e7dbca1"

inherit pypi
inherit setuptools3
inherit native
