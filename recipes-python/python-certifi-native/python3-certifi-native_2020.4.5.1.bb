SUMMARY = "curated collection of Root Certificates"
DESCRIPTION = "A carefully curated collection of Root Certificates for validating the trustworthiness \
               of SSL certificates while verifying the identity of TLS hosts"
HOMEPAGE = "https://github.com/certifi/python-certifi"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f77f61d14ee6feac4228d3ebd26cc1f1"

PYPI_PACKAGE = "certifi"

SRC_URI[md5sum] = "8e90cfd6fc5ddd7e3011958d8a7fcab4"
SRC_URI[sha256sum] = "51fcb31174be6e6664c5f69e3e1691a2d72a1a12e90f872cbdb1567eb47b6519"

inherit pypi
inherit native
inherit setuptools3
