SUMMARY = "Python @deprecated decorator to deprecate old classes, functions or methods"
HOMEPAGE = "https://github.com/tantale/deprecated"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=44288e26f4896bdab14072d4fa35ff01"

DEPENDS += "\
            python3-wrapt-native \
           "

PYPI_PACKAGE = "Deprecated"

SRC_URI[md5sum] = "6d3cdba9eae4c15531b046cc4b112cd7"
SRC_URI[sha256sum] = "b1b50e0ff0c1fddaa5708a2c6b0a6588bb09b892825ab2b214ac9ea9d92a5223"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native
