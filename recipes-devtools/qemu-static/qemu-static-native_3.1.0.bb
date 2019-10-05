SUMMARY = "Fast open source processor emulator (compiled statically)"
HOMEPAGE = "http://qemu.org"
LICENSE = "GPLv2 & LGPLv2.1"

SRC_URI = "https://download.qemu.org/qemu-${PV}.tar.xz"

SRC_URI[md5sum] = "fb687ce0b02d3bf4327e36d3b99427a8"
SRC_URI[sha256sum] = "6a0508df079a0a33c2487ca936a56c12122f105b8a96a44374704bef6c69abfc"

LIC_FILES_CHKSUM = "file://COPYING;md5=441c28d2cf86e15a37fa47e15a72fbac \
                    file://COPYING.LIB;endline=24;md5=c04def7ae38850e7d3ef548588159913"

S = "${WORKDIR}/qemu-${PV}"
B = "${WORKDIR}/build"

DEPENDS = "glib-2.0-native zlib-native"

inherit pkgconfig
inherit native

QEMU_CONFIGURE_OPTS = "\
                       --prefix=${prefix} \
                       --bindir=${bindir} \
                       --includedir=${includedir} \
                       --libdir=${libdir} \
                       --mandir=${mandir} \
                       --datadir=${datadir} \
                       --docdir=${docdir}/${BPN} \
                       --sysconfdir=${sysconfdir} \
                       --libexecdir=${libexecdir} \
                       --localstatedir=${localstatedir} \
                       --with-confsuffix=/${BPN} \
                       --disable-strip \
                       --disable-werror \
                       --extra-cflags='${CFLAGS}' \
                       --static \
                       --disable-system \
                       --enable-linux-user \
                       --disable-tools \
                       --disable-blobs \
                       --disable-guest-agent \
                    "

QEMU_TARGETS = "arm-linux-user \
                aarch64-linux-user \
                i386-linux-user \
                mips-linux-user \
                mipsel-linux-user \
                mips64-linux-user \
                mips64el-linux-user \
                ppc-linux-user \
                riscv32-linux-user \
                riscv64-linux-user \
                sh4-linux-user \
                x86_64-linux-user"

QEMU_TARGET_CONF_OPT = "${@','.join(d.getVar('QEMU_TARGETS').split(' '))}"

do_configure() {
    ${S}/configure ${QEMU_CONFIGURE_OPTS} \    
    --target-list=${QEMU_TARGET_CONF_OPT}
}

do_compile() {
    oe_runmake
}

FILES_${PN} = "${bindir}"

do_install () {
	export STRIP=""
	oe_runmake 'DESTDIR=${D}' install

    ## Rename the binaries to *-static
    find ${D} -executable -type f -exec mv {} {}-static \;
}

INSANE_SKIP_${PN} = "arch"