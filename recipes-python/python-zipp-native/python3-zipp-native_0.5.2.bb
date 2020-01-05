SUMMARY = "Backport of pathlib-compatible object wrapper for zip files"
DESCRIPTION = "Backport of pathlib-compatible object wrapper for zip files"
HOMEPAGE = "https://github.com/jaraco/zipp"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a33f38bbf47d48c70fe0d40e5f77498e"

DEPENDS += "${PYTHON_PN}-setuptools-scm-native"

PYPI_PACKAGE = "zipp"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "a0fd3753611113293992665059c69730"
SRC_URI[sha256sum] = "4970c3758f4e89a7857a973b1e2a5d75bcdc47794442f2e2dd4fe8e0466e809a"
