SUMMARY = "curated collection of Root Certificates"
DESCRIPTION = "A carefully curated collection of Root Certificates for validating the trustworthiness \
               of SSL certificates while verifying the identity of TLS hosts"
HOMEPAGE = "https://github.com/certifi/python-certifi"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f77f61d14ee6feac4228d3ebd26cc1f1"

PYPI_PACKAGE = "certifi"

SRC_URI[md5sum] = "89525ece725d674d91b0c43007d2a47e"
SRC_URI[sha256sum] = "5930595817496dd21bb8dc35dad090f1c2cd0adfaf21204bf6732ca5d8ee34d3"

inherit pypi
inherit native
inherit setuptools3
