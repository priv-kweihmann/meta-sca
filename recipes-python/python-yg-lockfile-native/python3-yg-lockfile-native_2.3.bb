SUMMARY = "Lockfile object with timeouts and context manager"
HOMEPAGE = "https://github.com/yougov/yg.lockfile"

LICENSE = "MIT"
# https://github.com/jaraco/skeleton/issues/1
# Author refuses to ship a license file
# but according to his own perspective meta-data is enough
# as meta-data states MIT we are using MIT here
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "\
            python3-jaraco-functools-native \
            python3-tempora-native \
            python3-zc-lockfile-native \
           "

PYPI_PACKAGE = "yg.lockfile"

SRC_URI[md5sum] = "3c2426accf171207cb6a4a35e2fa3c7b"
SRC_URI[sha256sum] = "b8c8a482958daaa47682bc3004d237c2888e0086e55c2b47b5d8810d100db732"

inherit pypi
inherit setuptools3
inherit native
