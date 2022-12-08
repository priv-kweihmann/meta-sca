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

SRC_URI[sha256sum] = "5159b8a9485a5a0d0254a29c9bd8b8ce66db2eb9a1a0244c64dfce43f7f2ac90"

inherit pypi
inherit setuptools3
inherit native
