SUMMARY = "Static code analyzer for C/C++"
HOMEPAGE = "https://github.com/JossWhittle/FlintPlusPlus"

LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e4224ccaecb14d942c71d31bef20d78c"

SRC_URI = "git://github.com/JossWhittle/FlintPlusPlus.git;protocol=https;branch=master \
           file://flint.sca.description"

SRCREV = "e209329bdf0d1c53c43474519bd875b692f9d61e"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit pkgconfig
inherit sca-description
inherit native

## we don't need debug packages
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

do_compile() {
    cd ${B}/flint
    oe_runmake
    cd -
}

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${datadir}
    install ${B}/flint/flint++ ${D}${bindir}
    install ${WORKDIR}/flint.sca.description ${D}${datadir}/
}

FILES_${PN} = "${bindir} ${datadir}"
