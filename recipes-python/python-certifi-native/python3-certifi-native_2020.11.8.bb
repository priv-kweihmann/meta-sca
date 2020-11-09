SUMMARY = "curated collection of Root Certificates"
DESCRIPTION = "A carefully curated collection of Root Certificates for validating the trustworthiness \
               of SSL certificates while verifying the identity of TLS hosts"
HOMEPAGE = "https://github.com/certifi/python-certifi"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f77f61d14ee6feac4228d3ebd26cc1f1"

PYPI_PACKAGE = "certifi"

SRC_URI[md5sum] = "b25267355218d11652c707e46accd059"
SRC_URI[sha256sum] = "f05def092c44fbf25834a51509ef6e631dc19765ab8a57b4e7ab85531f0a9cf4"

inherit pypi
inherit native
inherit setuptools3
