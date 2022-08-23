SUMMARY = "mostly correct pip requirements parsing library "
HOMEPAGE = "https://github.com/nexB/pip-requirements-parser"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=961e541f21c179e02693b13ceec3ba7b"

DEPENDS += "\
    python3-packaging-native \
    python3-setuptools-scm-native \
"

PYPI_PACKAGE = "pip-requirements-parser"

SRC_URI[sha256sum] = "8c2a6f8e091ac2693824a5ef4e3b250226e34f74a20a91a87b9ab0714b47788f"

inherit pypi
inherit setuptools3
inherit native
