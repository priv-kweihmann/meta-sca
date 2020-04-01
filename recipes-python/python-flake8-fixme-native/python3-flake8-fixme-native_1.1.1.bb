SUMMARY = "Check for FIXME, TODO and other temporary developer notes"
HOMEPAGE = "https://github.com/tommilligan/flake8-fixme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "${PYTHON_PN}-flake8-native"

SRC_URI += "git://github.com/tommilligan/flake8-fixme.git;protocol=https;tag=v${PV}"
S = "${WORKDIR}/git"

inherit native
inherit setuptools3
