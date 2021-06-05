SUMMARY = "curated collection of Root Certificates"
DESCRIPTION = "A carefully curated collection of Root Certificates for validating the trustworthiness \
               of SSL certificates while verifying the identity of TLS hosts"
HOMEPAGE = "https://github.com/certifi/python-certifi"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=67da0714c3f9471067b729eca6c9fbe8"

PYPI_PACKAGE = "certifi"

SRC_URI[md5sum] = "4b38238b7305fcb3ffbc4368be4e8845"
SRC_URI[sha256sum] = "2bbf76fd432960138b3ef6dda3dde0544f27cbf8546c458e60baf371917ba9ee"

inherit pypi
inherit setuptools3
inherit native
