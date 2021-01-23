SUMMARY = "A sliding memory map manager"
HOMEPAGE = "https://github.com/gitpython-developers/smmap"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6081cefc063aadb00257efe98fad8f7c"

SRC_URI += "git://github.com/gitpython-developers/smmap.git;protocol=https"
SRCREV = "119cc417541f400b3533c02d53d3d5f236e87023"

S = "${WORKDIR}/git"

inherit native
inherit setuptools3
