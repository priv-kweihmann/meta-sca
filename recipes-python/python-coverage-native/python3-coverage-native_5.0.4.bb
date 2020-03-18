SUMMARY = "Code coverage measurement for Python"

HOMEPAGE = "https://github.com/nedbat/coveragepy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "687b7d95466baf7804f60ab82c1bf5d8"
SRC_URI[sha256sum] = "1b60a95fc995649464e0cd48cecc8288bac5f4198f21d04b8229dc4097d76823"
