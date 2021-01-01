SUMMARY = "Manage dynamic plugins for Python applications"
HOMEPAGE = "https://docs.openstack.org/stevedore/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "\
            python3-importlib-metadata-native \
            python3-pbr-native \
            "

PYPI_PACKAGE = "stevedore"

SRC_URI[md5sum] = "99602f0b2c5507ae87090575b444fe32"
SRC_URI[sha256sum] = "3a5bbd0652bf552748871eaa73a4a8dc2899786bc497a2aa1fcb4dcdb0debeee"

inherit pypi
inherit setuptools3
inherit native
