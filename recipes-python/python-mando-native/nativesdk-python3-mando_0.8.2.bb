SUMMARY = "Create Python CLI apps with little to no effort at all!"
HOMEPAGE = "https://github.com/rubik/mando"

DEPENDS += "nativesdk-python3-six"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3c8e41bdf640795815537c1ce89a3aa"

PYPI_PACKAGE = "mando"

SRC_URI[md5sum] = "f39593e6f5adad58c4d6583b06cdd9e2"
SRC_URI[sha256sum] = "539659d9a2fdc6c9a188211c58f381e0dafe9597085174c5472eb1ed0224b6b5"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-pytest \
    nativesdk-python3-six \
    nativesdk-python3-unittest \
"
