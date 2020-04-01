SUMMARY = "IO of git-style object databases"
HOMEPAGE = "https://github.com/gitpython-developers/gitdb"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c910216328d3bde24e9f737d0b09c316"

DEPENDS += "\
            ${PYTHON_PN}-native \
            ${PYTHON_PN}-smmap-native \
           "

PYPI_PACKAGE = "gitdb"

SRC_URI[md5sum] = "2fd93921710ce40e1b60f0430130d3f1"
SRC_URI[sha256sum] = "598e0096bb3175a0aab3a0b5aedaa18a9a25c6707e0eca0695ba1a0baf1b2150"

inherit pypi
inherit setuptools3
inherit native
