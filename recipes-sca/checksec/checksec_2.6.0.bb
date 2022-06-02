SUMMARY = "Linux system security checks"
DESCRIPTION = "script to check the properties of executables (like PIE, RELRO, PaX, Canaries, ASLR, Fortify Source)"
HOMEPAGE = "https://github.com/slimm609/checksec.sh"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=879b2147c754bc040c29e9c3b84da836"

SRC_URI = "git://github.com/slimm609/checksec.sh;protocol=https;branch=main"
SRCREV = "2753ebb89fcdc96433ae8a4c4e5a49214a845be2"

S = "${WORKDIR}/git"

SCA_TOOL_DESCRIPTION = "checksec"

inherit sca-description

do_install:class-target() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/checksec ${D}${bindir}
}

RDEPENDS:${PN}:class-target += "\
    bash \
    binutils \
    file \
    openssl-bin \
"

FILES:${PN} += "${bindir}"

BBCLASSEXTEND = "native"
