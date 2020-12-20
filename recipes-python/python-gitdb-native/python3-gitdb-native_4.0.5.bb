SUMMARY = "IO of git-style object databases"
HOMEPAGE = "https://github.com/gitpython-developers/gitdb"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=59e5ecb13339a936eedf83282eaf4528"

DEPENDS += "\
            python3-native \
            python3-smmap-native \
           "

PYPI_PACKAGE = "gitdb"

SRC_URI[md5sum] = "0e2d3f34efece5deda7c55fede6507cc"
SRC_URI[sha256sum] = "c9e1f2d0db7ddb9a704c2a0217be31214e91a4fe1dea1efad19ae42ba0c285c9"

inherit pypi
inherit setuptools3
inherit native
