SUMMARY = "Python PE parsing module"
HOMEPAGE = "https://github.com/erocarrera/pefile"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38066667888b01d8118ff9cc23da1873"

DEPENDS += "\
            python3-future-native \
           "

PYPI_PACKAGE = "pefile"

SRC_URI[md5sum] = "fa0eba7c91f4e696771ddbfacdca25e4"
SRC_URI[sha256sum] = "82e6114004b3d6911c77c3953e3838654b04511b8b66e8583db70c65998017dc"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-future"
