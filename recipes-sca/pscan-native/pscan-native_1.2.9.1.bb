SUMMARY = "A limited problem scanner for C source files"
HOMEPAGE = "http://deployingradius.com/pscan/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS += "flex-native"

SRC_URI = "git://github.com/priv-kweihmann/pscan.git;branch=master;protocol=https"
SRCREV = "ce7f87da3d2ea265ad27bbdf10828532c8e3a028"

UNPACKDIR ??= "${WORKDIR}"
S = "${UNPACKDIR}/git"

inherit sca-description
inherit_defer native

SCA_TOOL_DESCRIPTION = "pscan"

do_configure[noexec] = "1"

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/pscan ${D}${bindir}
}

FILES:${PN} += "${bindir}"

RDEPENDS:${PN}:class-nativesdk += "nativesdk-flex"
