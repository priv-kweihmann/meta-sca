SUMMARY = "Python ASN.1 library with a focus on performance and a pythonic API"
HOMEPAGE = "https://github.com/wbond/asn1crypto"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5cda97fbd7959ad47a952651a87051a"

PYPI_PACKAGE = "asn1crypto"

SRC_URI[md5sum] = "f7a5271af9b81246fbdf57d703afce2f"
SRC_URI[sha256sum] = "13ae38502be632115abf8a24cbe5f4da52e3b5231990aff31123c805306ccb9c"

inherit pypi
inherit setuptools3
inherit native
