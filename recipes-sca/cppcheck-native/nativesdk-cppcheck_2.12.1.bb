SUMMARY = "Static code analyzer for C/C++"
HOMEPAGE = "https://github.com/danmar/cppcheck"
BUGTRACKER = "https://trac.cppcheck.net/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only & BSD-2-Clause & BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
    file://externals/simplecpp/LICENSE;md5=959bffe2993816eb32ec4bc1ec1d5875 \
    file://externals/tinyxml2/LICENSE;md5=135624eef03e1f1101b9ba9ac9b5fffd \
    file://externals/picojson/LICENSE;md5=29d6d693711f69885bbfe08072624f2e \
"

SRC_URI = "\
    git://github.com/danmar/cppcheck.git;protocol=https;nobranch=1 \
"
SRCREV = "65da79394471784641568dc4ac5da5466599809d"

S = "${WORKDIR}/git"

inherit pkgconfig

inherit sca-description
inherit nativesdk
LIBZ3 = "nativesdk-z3"
PACKAGECONFIG ??= "z3"
PACKAGECONFIG[z3] = "USE_Z3=yes,,${LIBZ3}"
SCA_TOOL_DESCRIPTION = "cppcheck"
do_compile() {
    oe_runmake ${PACKAGECONFIG_CONFARGS} FILESDIR=.
}
do_install() {
    oe_runmake install DESTDIR=${D} FILESDIR=${datadir} PREFIX=${prefix}
}
FILES:${PN} = "${bindir} ${datadir}"
UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+(\.\d+)*)$"
