require cppcheck.inc

SRC_URI = "git://github.com/danmar/cppcheck.git;protocol=https;tag=${PV} \
           file://0001-Makefile-fixes.patch \
           file://cppcheck.sca.description \
           file://cppcheck.sca.score"

S = "${WORKDIR}/git"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"