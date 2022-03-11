SUMMARY = "Python ASN.1 library with a focus on performance and a pythonic API"
HOMEPAGE = "https://github.com/wbond/asn1crypto"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5cda97fbd7959ad47a952651a87051a"

PYPI_PACKAGE = "asn1crypto"

SRC_URI[md5sum] = "fbcbd9ba89cd8fafe0deaf1263922162"
SRC_URI[sha256sum] = "2c9eb1b1635425bcadf94749bbcd83bfa8b0a912661bad6106466521d484d62b"

inherit pypi
inherit setuptools3
inherit native
