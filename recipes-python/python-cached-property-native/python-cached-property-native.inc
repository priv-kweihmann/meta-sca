SUMMARY = "A decorator for caching properties in classes. "
DESCRIPTION = "A decorator for caching properties in classes. "
HOMEPAGE = "https://github.com/pydanny/cached-property"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db7ff60c4e14f58534201242803d8abc"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "cached-property"

inherit pypi

FILES_${PN} += "${datadir}/cached_property"

inherit native
