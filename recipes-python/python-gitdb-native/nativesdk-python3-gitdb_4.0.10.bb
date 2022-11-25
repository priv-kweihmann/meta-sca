SUMMARY = "IO of git-style object databases"
HOMEPAGE = "https://github.com/gitpython-developers/gitdb"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=59e5ecb13339a936eedf83282eaf4528"

DEPENDS += "\
    nativesdk-python3 \
    nativesdk-python3-smmap \
"

PYPI_PACKAGE = "gitdb"

SRC_URI[md5sum] = "ed3c3098db50d2afce0447f6ab3d9903"
SRC_URI[sha256sum] = "6eb990b69df4e15bad899ea868dc46572c3f75339735663b81de79b06f17eb9a"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3 \
    nativesdk-python3-smmap \
"
