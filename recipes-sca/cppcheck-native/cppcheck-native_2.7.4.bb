SUMMARY = "Static code analyzer for C/C++"
HOMEPAGE = "https://github.com/danmar/cppcheck"
BUGTRACKER = "https://trac.cppcheck.net/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/danmar/cppcheck.git;protocol=https;nobranch=1 \
           file://0001-Makefile-fixes.patch"
SRCREV = "1cc234ac2c1a7ba8c62e4d57b4595b8f69990bd2"

S = "${WORKDIR}/git"

inherit pkgconfig
inherit sca-description
inherit native

PACKAGECONFIG ??= "rules z3"
PACKAGECONFIG[rules] = "HAVE_RULES=yes,,libpcre-native"
PACKAGECONFIG[z3] = "USE_Z3=yes,,z3-native"

SCA_TOOL_DESCRIPTION = "cppcheck"

do_compile() {
    oe_runmake ${PACKAGECONFIG_CONFARGS} FILESDIR=.
}

do_install() {
    oe_runmake install DESTDIR=${D} FILESDIR=${datadir} PREFIX=${prefix}
}

FILES:${PN} = "${bindir}"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+(\.\d+)*)$"
