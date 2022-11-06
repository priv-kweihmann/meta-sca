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

SRC_URI[md5sum] = "1798136315c72a914c0731df4b2f4323"
SRC_URI[sha256sum] = "8448ab7b939d18b64820478ecac5394f482d7a79f5f7eaa7703c6c959c175e1d"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-cryptography \
"
