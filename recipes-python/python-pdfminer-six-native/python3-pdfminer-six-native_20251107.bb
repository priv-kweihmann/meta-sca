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

SRC_URI[md5sum] = "c1a0141403b6ce74410d13a514f2d1a3"
SRC_URI[sha256sum] = "5fb0c553799c591777f22c0c72b77fc2522d7d10c70654e25f4c5f1fd996e008"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-cryptography \
    nativesdk-python3-setuptools-git-versioning \
"
