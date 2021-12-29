SUMMARY = "Classes Without Boilerplate"
HOMEPAGE = "https://github.com/python-attrs/attrs"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4ab25949a73fe7d4fdee93bcbdbf8ff"

PYPI_PACKAGE = "attrs"

SRC_URI[md5sum] = "1b14cc7a29db69940d72a6eb876a913b"
SRC_URI[sha256sum] = "50f3c9b216dc9021042f71b392859a773b904ce1a029077f58f6598272432045"

inherit pypi
inherit setuptools3
inherit native
