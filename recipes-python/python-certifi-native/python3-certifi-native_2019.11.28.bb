DESCRIPTION = "A carefully curated collection of Root Certificates for validating the trustworthiness of SSL certificates while verifying the identity of TLS hosts"
HOMEPAGE = "https://github.com/certifi/python-certifi"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f77f61d14ee6feac4228d3ebd26cc1f1"
LICENSE = "MPL-2.0"

PYPI_PACKAGE = "certifi"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "4d5229c4d9f0a4a79106f9e2c2cfd381"
SRC_URI[sha256sum] = "25b64c7da4cd7479594d035c08c2d809eb4aab3a26e5a990ea98cc450c320f1f"
