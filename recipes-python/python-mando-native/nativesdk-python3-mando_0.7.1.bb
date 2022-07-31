SUMMARY = "Create Python CLI apps with little to no effort at all!"
HOMEPAGE = "https://github.com/rubik/mando"

DEPENDS += "nativesdk-python3-six"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3c8e41bdf640795815537c1ce89a3aa"

PYPI_PACKAGE = "mando"

SRC_URI[md5sum] = "b45233627e6eb72893993a7254737acc"
SRC_URI[sha256sum] = "18baa999b4b613faefb00eac4efadcf14f510b59b924b66e08289aa1de8c3500"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-pytest \
    nativesdk-python3-six \
    nativesdk-python3-unittest \
"
