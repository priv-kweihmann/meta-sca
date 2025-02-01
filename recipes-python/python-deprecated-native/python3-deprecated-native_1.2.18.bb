SUMMARY = "Python @deprecated decorator to deprecate old classes, functions or methods"
HOMEPAGE = "https://github.com/tantale/deprecated"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=44288e26f4896bdab14072d4fa35ff01"

DEPENDS += "\
            python3-wrapt-native \
           "

PYPI_PACKAGE = "Deprecated"

SRC_URI[md5sum] = "d01ff749b9895432b67a003b6b30c4c4"
SRC_URI[sha256sum] = "422b6f6d859da6f2ef57857761bfb392480502a64c3028ca9bbe86085d72115d"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native
