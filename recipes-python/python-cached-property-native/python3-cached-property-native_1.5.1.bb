SUMMARY = "A decorator for caching properties in classes. "
DESCRIPTION = "A decorator for caching properties in classes. "
HOMEPAGE = "https://github.com/pydanny/cached-property"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db7ff60c4e14f58534201242803d8abc"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "cached-property"

FILES_${PN} += "${datadir}/cached_property"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "4b6f3cd429da5f487f4ebf3242bb991f"
SRC_URI[sha256sum] = "9217a59f14a5682da7c4b8829deadbfc194ac22e9908ccf7c8820234e80a1504"
