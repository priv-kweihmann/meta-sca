SUMMARY = "IO of git-style object databases"
HOMEPAGE = "https://github.com/gitpython-developers/gitdb"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=59e5ecb13339a936eedf83282eaf4528"

DEPENDS += "\
            ${PYTHON_PN}-native \
            ${PYTHON_PN}-smmap-native \
           "

PYPI_PACKAGE = "gitdb"

SRC_URI[md5sum] = "00c75b9ff253972afc1a654a76d69786"
SRC_URI[sha256sum] = "6f0ecd46f99bb4874e5678d628c3a198e2b4ef38daea2756a2bfd8df7dd5c1a5"

inherit pypi
inherit setuptools3
inherit native
