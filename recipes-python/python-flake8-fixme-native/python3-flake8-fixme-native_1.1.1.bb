SUMMARY = "Check for FIXME, TODO and other temporary developer notes"
HOMEPAGE = "https://github.com/tommilligan/flake8-fixme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "python3-flake8-native"

SRC_URI += "git://github.com/tommilligan/flake8-fixme.git;protocol=https"
SRCREV = "8efe63380de2e42e8049235f135bf102c6d22ea6"
S = "${WORKDIR}/git"

inherit setuptools3
inherit native
