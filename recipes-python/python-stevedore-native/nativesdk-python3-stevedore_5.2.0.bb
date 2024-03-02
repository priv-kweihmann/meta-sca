SUMMARY = "Manage dynamic plugins for Python applications"
HOMEPAGE = "https://docs.openstack.org/stevedore/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "python3-pbr-native"

PYPI_PACKAGE = "stevedore"

SRC_URI[md5sum] = "3e671daf97272ae35ab1f078c9973c38"
SRC_URI[sha256sum] = "46b93ca40e1114cea93d738a6c1e365396981bb6bb78c27045b7587c9473544d"

inherit pypi
inherit setuptools3
inherit nativesdk

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
