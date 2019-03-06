SUMMARY = "IO of git-style object databases"
DESCRIPTION = "IO of git-style object databases"
HOMEPAGE = "https://github.com/gitpython-developers/gitdb"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=59e5ecb13339a936eedf83282eaf4528"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "gitdb"

inherit pypi

FILES_${PN} += "${datadir}/gitdb"

inherit native
