SUMMARY = "Manage dynamic plugins for Python applications"
HOMEPAGE = "https://docs.openstack.org/stevedore/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "python3-pbr-native"

PYPI_PACKAGE = "stevedore"

SRC_URI[md5sum] = "913ca9261fa0d911554f7c05b5f4b8b1"
SRC_URI[sha256sum] = "02518a8f0d6d29be8a445b7f2ac63753ff29e8f2a2faa01777568d5500d777a6"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-crypt \
    nativesdk-python3-docutils \
    nativesdk-python3-json \
    nativesdk-python3-logging \
    nativesdk-python3-setuptools \
    nativesdk-python3-shell \
    nativesdk-python3-unittest \
"
