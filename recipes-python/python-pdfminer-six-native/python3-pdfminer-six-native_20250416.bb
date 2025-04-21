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

SRC_URI[md5sum] = "830d03490d930a3d015a97a302aeada9"
SRC_URI[sha256sum] = "30956a85f9d0add806a4e460ed0d67c2b6a48b53323c7ac87de23174596d3acd"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-cryptography \
    nativesdk-python3-setuptools-git-versioning \
"
