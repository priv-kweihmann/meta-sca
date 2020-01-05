DESCRIPTION = "A carefully curated collection of Root Certificates for validating the trustworthiness of SSL certificates while verifying the identity of TLS hosts"
HOMEPAGE = "https://github.com/certifi/python-certifi"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f77f61d14ee6feac4228d3ebd26cc1f1"
LICENSE = "MPL-2.0"

PYPI_PACKAGE = "certifi"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "af8fea5f3df6f7f81e9c6cbc6dd7c1e8"
SRC_URI[sha256sum] = "945e3ba63a0b9f577b1395204e13c3a231f9bc0223888be653286534e5873695"
