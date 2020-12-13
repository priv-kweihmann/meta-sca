SUMMARY = "chroot, mount --bind, and binfmt_misc without privilege/setup for Linux"
DESCRIPTION = "PRoot is a user-space implementation of chroot, mount --bind, and binfmt_misc.\
               This means that users don't need any privileges or setup to do things like using \
               an arbitrary directory as the new root filesystem, making files accessible somewhere \
               else in the filesystem hierarchy, or executing programs built for another CPU \
               architecture transparently through QEMU user-mode"
HOMEPAGE = "https://github.com/proot-me/proot"
LICENSE = "GPL-2.0"

LIC_FILES_CHKSUM = "file://../COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "libtalloc-native libarchive-native"

SRC_URI = "git://github.com/proot-me/proot.git;protocol=https"
SRCREV = "ab43a25e35586b860d73d11da4c0076e6fe2b427"

S = "${WORKDIR}/git/src"

UPSTREAM_CHECK_COMMITS = "1"

inherit native
inherit pkgconfig

do_compile() {
    oe_runmake PREFIX=${prefix} BINDIR=${bindir}
}

FILES_${PN} = "${bindir}"


do_install() {
    oe_runmake install DESTDIR=${D} PREFIX=$prefix BINDIR=${bindir}
}
