SUMMARY = "script for checking on linux kernel hardening"
HOMEPAGE = "https://github.com/a13xp0p0v/kconfig-hardened-check"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "python3-native"

SRC_URI = "git://github.com/a13xp0p0v/kconfig-hardened-check.git;protocol=https;branch=master \
           file://kconfighard.sca.description"
SRCREV = "f5277e585c2cee7b1d58c67abb9577e827f672ab"
S = "${WORKDIR}/git"

inherit setuptools3
inherit sca-description
inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/kconfighard.sca.description ${D}${datadir}/
}

FILES:${PN} = "${bindir} ${datadir}"
