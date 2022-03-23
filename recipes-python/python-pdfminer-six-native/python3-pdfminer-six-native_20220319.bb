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

SRC_URI[md5sum] = "0ded99a71083caadee84d80e77614a17"
SRC_URI[sha256sum] = "eff2ce0abeaa4df94dc3461f70eab104487c7b4a2b3c7e9fd0aeec6c5f44d6a6"

inherit pypi
inherit setuptools3
inherit native
