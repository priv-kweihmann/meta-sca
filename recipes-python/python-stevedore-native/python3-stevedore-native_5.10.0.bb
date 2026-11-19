SUMMARY = "Manage dynamic plugins for Python applications"
HOMEPAGE = "https://docs.openstack.org/stevedore/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "python3-pbr-native"

PYPI_PACKAGE = "stevedore"

SRC_URI[md5sum] = "cd3b19c3c989fc7c7e167c5404408280"
SRC_URI[sha256sum] = "6005f32c09dc3159802a61c04862770e439e32db22f6da78ba56e8a735466882"

inherit pypi
inherit python_pep517
inherit_defer native

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
