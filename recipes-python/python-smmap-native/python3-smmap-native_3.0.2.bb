SUMMARY = "A sliding memory map manager"
HOMEPAGE = "https://github.com/gitpython-developers/smmap"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6081cefc063aadb00257efe98fad8f7c"

SRC_URI += "git://github.com/gitpython-developers/smmap.git;protocol=https"
SRCREV = "f4d7a58b4d96200cd057a38a0758d3c84901f57e"

S = "${WORKDIR}/git"

inherit native
inherit setuptools3
