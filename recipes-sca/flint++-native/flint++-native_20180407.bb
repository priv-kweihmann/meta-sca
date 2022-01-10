SUMMARY = "Static code analyzer for C/C++"
HOMEPAGE = "https://github.com/JossWhittle/FlintPlusPlus"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e4224ccaecb14d942c71d31bef20d78c"

SRC_URI = "git://github.com/JossWhittle/FlintPlusPlus.git;protocol=https;branch=master"

SRCREV = "e209329bdf0d1c53c43474519bd875b692f9d61e"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit pkgconfig
inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "flint"

## we don't need debug packages
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

do_compile() {
    cd ${B}/flint
    oe_runmake
    cd -
}

do_install() {
    install -d ${D}${bindir}
    install ${B}/flint/flint++ ${D}${bindir}
}

FILES:${PN} = "${bindir}"
