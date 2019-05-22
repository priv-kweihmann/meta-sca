SUMMARY = "count source lines of code (SLOC) using pygments"
DESCRIPTION = "count source lines of code (SLOC) using pygments"
HOMEPAGE = "https://github.com/roskakori/pygount"
LICENSE = "BSD-3-Clause"

SRC_URI += "git://github.com/roskakori/pygount.git;protocol)=https;tag=v${PV}"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e1d7b7bffbfeaa14083fd2bd3236aea8"

DEPENDS += "\
            ${PYTHON_PN}-native \
            ${PYTHON_PN}-pygments-native \
            "

S = "${WORKDIR}/git"

inherit native
