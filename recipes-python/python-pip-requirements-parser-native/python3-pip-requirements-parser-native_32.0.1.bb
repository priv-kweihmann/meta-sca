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

SRC_URI[sha256sum] = "b4fa3a7a0be38243123cf9d1f3518da10c51bdb165a2b2985566247f9155a7d3"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
