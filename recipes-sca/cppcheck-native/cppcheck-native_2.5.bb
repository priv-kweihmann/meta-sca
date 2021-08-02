SUMMARY = "Static code analyzer for C/C++"
HOMEPAGE = "https://github.com/danmar/cppcheck"
BUGTRACKER = "https://trac.cppcheck.net/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/danmar/cppcheck.git;protocol=https;nobranch=1 \
           file://0001-Makefile-fixes.patch \
           file://cppcheck.sca.description"
SRCREV = "f5b44b0b0b59d6d3284357e08884ad8c59612599"

S = "${WORKDIR}/git"

inherit pkgconfig
inherit sca-description
inherit native

PACKAGECONFIG ??= "rules z3"
PACKAGECONFIG[rules] = "HAVE_RULES=yes,,libpcre-native"
PACKAGECONFIG[z3] = "USE_Z3=yes,,z3-native"

do_compile() {
    oe_runmake ${PACKAGECONFIG_CONFARGS} FILESDIR=.
}

do_install() {
    oe_runmake install DESTDIR=${D} FILESDIR=${datadir} PREFIX=${prefix}
    install ${WORKDIR}/cppcheck.sca.description ${D}${datadir}
}

FILES:${PN} = "${bindir} ${datadir}"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+(\.\d+)*)$"
