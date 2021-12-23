SUMMARY = "Python @deprecated decorator to deprecate old classes, functions or methods"
HOMEPAGE = "https://github.com/tantale/deprecated"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=44288e26f4896bdab14072d4fa35ff01"

DEPENDS += "\
            python3-wrapt-native \
           "

PYPI_PACKAGE = "Deprecated"

SRC_URI[md5sum] = "2b7a15b559af0b9b499737d70e171b4b"
SRC_URI[sha256sum] = "43ac5335da90c31c24ba028af536a91d41d53f9e6901ddb021bcc572ce44e38d"

inherit pypi
inherit setuptools3
inherit native
