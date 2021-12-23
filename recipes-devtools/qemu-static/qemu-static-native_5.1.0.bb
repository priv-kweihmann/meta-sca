SUMMARY = "Fast open source processor emulator (compiled statically)"
HOMEPAGE = "http://qemu.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPLv2 & LGPLv2.1"

LIC_FILES_CHKSUM = "file://COPYING;md5=441c28d2cf86e15a37fa47e15a72fbac \
                    file://COPYING.LIB;endline=24;md5=8c5efda6cf1e1b03dcfd0e6c0d271c7f"

DEPENDS += "glib-2.0-native zlib-native"

# NOTE: If you get an configure error like
# ERROR: sizeof(size_t) doesn't match GLIB_SIZEOF_SIZE_T.
#        You probably need to set PKG_CONFIG_LIBDIR
#        to point to the right pkg-config files for your
#        build target
#
# WARNING: exit code 1 from a shell command.
#
# you likely need to install glib-2.0-dev on your host

SRC_URI = "https://download.qemu.org/qemu-${PV}.tar.xz"

SRC_URI[md5sum] = "f3eb729786591f05a9ac5d8ab03b9269"
SRC_URI[sha256sum] = "c9174eb5933d9eb5e61f541cd6d1184cd3118dfe4c5c4955bc1bdc4d390fa4e5"

S = "${WORKDIR}/qemu-${PV}"
B = "${WORKDIR}/build"

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

QEMU_TARGETS_STATIC ?= "arm-linux-user \
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

QEMU_TARGET_CONF_OPT = "${@','.join(d.getVar('QEMU_TARGETS_STATIC').split(' '))}"

do_configure() {
    ${S}/configure ${QEMU_CONFIGURE_OPTS} \
    --target-list=${QEMU_TARGET_CONF_OPT}
}

do_compile() {
    oe_runmake
}

FILES:${PN} = "${bindir}"

do_install () {
    export STRIP=""
    oe_runmake 'DESTDIR=${D}' install

    ## This otherwise collides with qemu-native, as we only need the binaries, it's okay here
    rm -rf ${D}${datadir}

    ## Rename the binaries to *-static
    find ${D} -executable -type f -exec mv {} {}-static \;
}

INSANE_SKIP:${PN} = "arch"
