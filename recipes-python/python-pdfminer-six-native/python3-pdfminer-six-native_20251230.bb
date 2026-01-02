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

SRC_URI[md5sum] = "2cf606fd2830678005640e822acdb590"
SRC_URI[sha256sum] = "e8f68a14c57e00c2d7276d26519ea64be1b48f91db1cdc776faa80528ca06c1e"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-cryptography \
    nativesdk-python3-setuptools-git-versioning \
"
