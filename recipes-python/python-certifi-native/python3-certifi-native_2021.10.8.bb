SUMMARY = "curated collection of Root Certificates"
DESCRIPTION = "A carefully curated collection of Root Certificates for validating the trustworthiness \
               of SSL certificates while verifying the identity of TLS hosts"
HOMEPAGE = "https://github.com/certifi/python-certifi"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=67da0714c3f9471067b729eca6c9fbe8"

PYPI_PACKAGE = "certifi"

SRC_URI[md5sum] = "880ed9e5d04aff8f46f5ff82a3a3e395"
SRC_URI[sha256sum] = "78884e7c1d4b00ce3cea67b44566851c4343c120abd683433ce934a68ea58872"

inherit pypi
inherit setuptools3
inherit native
