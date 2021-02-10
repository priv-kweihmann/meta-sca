SUMMARY = "PDF parser and analyzer"
HOMEPAGE = "https://github.com/pdfminer/pdfminer.six"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=76a979b092386b9cfa8791fa22cbe404"

DEPENDS += "\
            python3-chardet-native \
            python3-cryptography-native \
           "

PYPI_PACKAGE = "pdfminer.six"

SRC_URI[md5sum] = "8c1552302c6d16d373ccebd00c550540"
SRC_URI[sha256sum] = "b9aac0ebeafb21c08bf65f2039f4b2c5f78a3449d0a41df711d72445649e952a"

inherit pypi
inherit setuptools3
inherit native
