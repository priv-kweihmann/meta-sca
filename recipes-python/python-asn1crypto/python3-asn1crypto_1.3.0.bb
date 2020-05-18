SUMMARY = "Python ASN.1 library with a focus on performance and a pythonic API"
HOMEPAGE = "https://github.com/wbond/asn1crypto"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7439e38f5e04ff62fae436184786b7ca"

PYPI_PACKAGE = "asn1crypto"

SRC_URI[md5sum] = "daad112940181917e3ff169b47b9bd9a"
SRC_URI[sha256sum] = "5a215cb8dc12f892244e3a113fe05397ee23c5c4ca7a69cd6e69811755efc42d"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
