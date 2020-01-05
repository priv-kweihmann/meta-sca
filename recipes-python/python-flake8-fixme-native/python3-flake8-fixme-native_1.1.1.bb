SUMMARY = "Check for FIXME, TODO and other temporary developer notes"
DESCRIPTION = "Check for FIXME, TODO and other temporary developer notes"
HOMEPAGE = "https://github.com/tommilligan/flake8-fixme"
LICENSE = "Apache-2.0"

SRC_URI += "git://github.com/tommilligan/flake8-fixme.git;protocol=https;tag=v${PV}"
S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"


DEPENDS += "${PYTHON_PN}-flake8-native"

inherit native
inherit setuptools3

SRC_URI[md5sum] = "da9615dc99c3600f5193ce4d14d01fe1"
SRC_URI[sha256sum] = "50cade07d27a4c30d4f12351478df87339e67640c83041b664724bda6d16f33a"
