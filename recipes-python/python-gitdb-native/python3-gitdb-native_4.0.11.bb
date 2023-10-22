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

SRC_URI[md5sum] = "6071755f2899cd4882b83a070b045bac"
SRC_URI[sha256sum] = "bf5421126136d6d0af55bc1e7c1af1c397a34f5b7bd79e776cd3e89785c2b04b"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3 \
    nativesdk-python3-smmap \
"
