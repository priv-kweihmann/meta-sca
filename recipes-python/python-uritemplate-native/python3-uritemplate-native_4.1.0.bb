SUMMARY = "URI templates"
HOMEPAGE = "https://github.com/python-hyper/uritemplate"

LICENSE = "Apache-2.0 | BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://LICENSE.APACHE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE.BSD;md5=6b574ed4b26bdce9060017ce052d0109 \
"

PYPI_PACKAGE = "uritemplate"

SRC_URI[md5sum] = "41a7400594e165838423ebf24f79cf0e"
SRC_URI[sha256sum] = "69387b2f904692c61e01acf38b72211fbe8a01d93ec9d5e6fd215c1346393b8d"

inherit pypi
inherit setuptools3
inherit native
