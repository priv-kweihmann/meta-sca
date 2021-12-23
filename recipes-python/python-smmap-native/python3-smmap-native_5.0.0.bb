SUMMARY = "A sliding memory map manager"
HOMEPAGE = "https://github.com/gitpython-developers/smmap"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6081cefc063aadb00257efe98fad8f7c"

SRC_URI += "git://github.com/gitpython-developers/smmap.git;protocol=https;nobranch=1"
SRCREV = "db8810096503dd8a1f5a021ff39be907417f90a7"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native
