SUMMARY = "Python @deprecated decorator to deprecate old classes, functions or methods"
HOMEPAGE = "https://github.com/tantale/deprecated"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=44288e26f4896bdab14072d4fa35ff01"

DEPENDS += "\
            python3-wrapt-native \
           "

PYPI_PACKAGE = "Deprecated"

SRC_URI[md5sum] = "432cf87ac5dd772b62f6f0ed7a18ca57"
SRC_URI[sha256sum] = "683e561a90de76239796e6b6feac66b99030d2dd3fcf61ef996330f14bbb9b0d"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native
