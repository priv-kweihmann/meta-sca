SUMMARY = "chroot, mount --bind, and binfmt_misc without privilege/setup for Linux"
HOMEPAGE = "https://github.com/proot-me/proot"
LICENSE = "GPL-2.0"

S = "${WORKDIR}/git/src"

SRC_URI = "git://github.com/proot-me/proot.git;protocol=https"
SRCREV = "037e77ef796cf4f10e170007a9929bdc400ca3de"

LIC_FILES_CHKSUM = "file://../COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit native
inherit pkgconfig

DEPENDS += "libtalloc-native"

do_compile() {
	oe_runmake PREFIX=${prefix} BINDIR=${bindir}
}

FILES_${PN} = "${bindir}"


do_install() {
    oe_runmake install DESTDIR=${D} PREFIX=$prefix BINDIR=${bindir}
}
