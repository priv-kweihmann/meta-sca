SUMMARY = "curated collection of Root Certificates"
DESCRIPTION = "A carefully curated collection of Root Certificates for validating the trustworthiness \
               of SSL certificates while verifying the identity of TLS hosts"
HOMEPAGE = "https://github.com/certifi/python-certifi"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f77f61d14ee6feac4228d3ebd26cc1f1"

PYPI_PACKAGE = "certifi"

SRC_URI[md5sum] = "522f9abe26e5d603a668d812aa6accca"
SRC_URI[sha256sum] = "1a4995114262bffbc2413b159f2a1a480c969de6e6eb13ee966d470af86af59c"

inherit pypi
inherit setuptools3
inherit native
