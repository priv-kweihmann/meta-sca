SUMMARY = "Python @deprecated decorator to deprecate old classes, functions or methods"
HOMEPAGE = "https://github.com/tantale/deprecated"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=44288e26f4896bdab14072d4fa35ff01"

DEPENDS += "\
            python3-wrapt-native \
           "

PYPI_PACKAGE = "Deprecated"

SRC_URI[md5sum] = "57e0ded86d04f22c65033dea230ad035"
SRC_URI[sha256sum] = "e5323eb936458dccc2582dc6f9c322c852a775a27065ff2b0c4970b9d53d01b3"

inherit pypi
inherit setuptools3
inherit native
