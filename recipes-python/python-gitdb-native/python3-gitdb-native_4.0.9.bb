SUMMARY = "IO of git-style object databases"
HOMEPAGE = "https://github.com/gitpython-developers/gitdb"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=59e5ecb13339a936eedf83282eaf4528"

DEPENDS += "\
            python3-native \
            python3-smmap-native \
           "

PYPI_PACKAGE = "gitdb"

SRC_URI[md5sum] = "f0664b7b791c2601dfa16004bb49a080"
SRC_URI[sha256sum] = "bac2fd45c0a1c9cf619e63a90d62bdc63892ef92387424b855792a6cabe789aa"

inherit pypi
inherit setuptools3
inherit native
