SUMMARY = "backport of configparser from Python 3 "
DESCRIPTION = "backport of configparser from Python 3 "
HOMEPAGE = "https://github.com/jaraco/configparser/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a33f38bbf47d48c70fe0d40e5f77498e"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "configparser"

inherit pypi
inherit native
