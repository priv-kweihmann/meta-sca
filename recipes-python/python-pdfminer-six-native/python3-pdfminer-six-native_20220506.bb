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

SRC_URI[md5sum] = "652622bad73b672b9333449f65f393c3"
SRC_URI[sha256sum] = "3d65c1a0f4a0465c709e191550ec77a684ebe0bcb562337ccbfb7aa228c52076"

inherit pypi
inherit setuptools3
inherit native
