SUMMARY = "IO of git-style object databases"
HOMEPAGE = "https://github.com/gitpython-developers/gitdb"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=59e5ecb13339a936eedf83282eaf4528"

DEPENDS += "\
            python3-native \
            python3-smmap-native \
           "

PYPI_PACKAGE = "gitdb"

SRC_URI[md5sum] = "3f52187435ab0b6e64a15782ffaf29ab"
SRC_URI[sha256sum] = "96bf5c08b157a666fec41129e6d327235284cca4c81e92109260f353ba138005"

inherit pypi
inherit setuptools3
inherit native
