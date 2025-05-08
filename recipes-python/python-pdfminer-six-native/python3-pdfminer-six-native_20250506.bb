SUMMARY = "PDF parser and analyzer"
HOMEPAGE = "https://github.com/pdfminer/pdfminer.six"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=76a979b092386b9cfa8791fa22cbe404"

DEPENDS += "\
    python3-chardet-native \
    python3-cryptography-native \
    python3-setuptools-git-versioning-native \
"

PYPI_PACKAGE = "pdfminer.six"

SRC_URI[md5sum] = "f6762cc68a84f9dc9e1f418fe5ced91b"
SRC_URI[sha256sum] = "b03cc8df09cf3c7aba8246deae52e0bca7ebb112a38895b5e1d4f5dd2b8ca2e7"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-cryptography \
    nativesdk-python3-setuptools-git-versioning \
"
