SUMMARY = "PDF parser and analyzer"
HOMEPAGE = "https://github.com/pdfminer/pdfminer.six"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=76a979b092386b9cfa8791fa22cbe404"

DEPENDS += "\
            python3-chardet-native \
            python3-cryptography-native \
           "

PYPI_PACKAGE = "pdfminer.six"

SRC_URI[md5sum] = "6e1c43bd4f14ce8316eaa5ca75ffb885"
SRC_URI[sha256sum] = "5a64c924410ac48501d6060b21638bf401db69f5b1bd57207df7fbc070ac8ae2"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-cryptography \
"
