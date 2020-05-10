SUMMARY = "Static code analyzer for C/C++"
HOMEPAGE = "https://github.com/danmar/cppcheck"
BUGTRACKER = "https://trac.cppcheck.net/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/danmar/cppcheck.git;protocol=https \
           file://0001-Makefile-fixes.patch \
           file://cppcheck.sca.description"
SRCREV = "aad6dc4367b253c221f7354b342d3000ba61aabb"

S = "${WORKDIR}/git"

inherit native
inherit pkgconfig
inherit sca-sanity
inherit sca-description

PACKAGECONFIG ??= "rules"
PACKAGECONFIG[rules] = "HAVE_RULES=yes,,libpcre-native"
PACKAGECONFIG[z3] = "USE_Z3=yes,,z3-native"

do_compile() {
    oe_runmake ${PACKAGECONFIG_CONFARGS} FILESDIR=.
}

do_install() {
    oe_runmake install DESTDIR=${D} FILESDIR=${datadir} PREFIX=${prefix}
    install ${WORKDIR}/cppcheck.sca.description ${D}${datadir}
}

FILES_${PN} = "${bindir} ${datadir}"
