require cppcheck.inc

SRC_URI = "git://github.com/danmar/cppcheck.git;protocol=https;nobranch=1 \
           file://0001-Makefile-fixes.patch \
           file://cppcheck.sca.description"
SRCREV = "077e652de43ad962be0454d7be347816f7482739"

S = "${WORKDIR}/git"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"