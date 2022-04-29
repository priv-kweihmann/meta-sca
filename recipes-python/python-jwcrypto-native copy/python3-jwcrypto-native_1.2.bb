SUMMARY = "Implementation of JOSE Web standards"
HOMEPAGE = "https://github.com/latchset/jwcrypto"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
            python3-cryptography-native \
            python3-deprecated-native \
           "

PYPI_PACKAGE = "jwcrypto"

SRC_URI[md5sum] = "a86edd7a79de84460422bd98b9904b68"
SRC_URI[sha256sum] = "edf4309321721e5161cefccdd64b04509e03924feaf3de085b47780765989ae3"

inherit pypi
inherit setuptools3
inherit native
