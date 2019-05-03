SUMMARY = "Python 3.4 Enum backported"
DESCRIPTION = "Python 3.4 Enum backported"
HOMEPAGE = "https://bitbucket.org/stoneleaf/enum34/src/default/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://enum/LICENSE;md5=0a97a53a514564c20efd7b2e8976c87e"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "enum34"

inherit pypi

inherit native
