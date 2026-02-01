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

SRC_URI[md5sum] = "bc363875db39b3ae960e8e644cad51d1"
SRC_URI[sha256sum] = "96bfd431e3577a55a0efd25676968ca4ce8fd5b53f14565f85716ff363889602"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-cryptography \
    nativesdk-python3-setuptools-git-versioning \
"
