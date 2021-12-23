# Ported copy of upstream poky recipe (http://git.yoctoproject.org/cgit/cgit.cgi/poky/tree/meta/recipes-devtools/qemu)
# licensed under MIT
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
#
# Note:
# Individual files contain the following tag instead of the full license text.
#
#     SPDX-License-Identifier: MIT
#
# This enables machine processing of license information based on the SPDX
# License Identifiers that are here available: http://spdx.org/licenses/
#

SUMMARY = "Fast open source processor emulator"
DESCRIPTION = "QEMU is a hosted virtual machine monitor: it emulates the \
machine's processor through dynamic binary translation and provides a set \
of different hardware and device models for the machine, enabling it to run \
a variety of guest operating systems"
HOMEPAGE = "http://qemu.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPLv2 & LGPLv2.1"

LIC_FILES_CHKSUM = "\
    file://COPYING;md5=441c28d2cf86e15a37fa47e15a72fbac \
    file://COPYING.LIB;endline=24;md5=8c5efda6cf1e1b03dcfd0e6c0d271c7f \
"

DEPENDS += "\
    bison-native \
    glib-2.0-native \
    meson-native \
    ninja-native \
    pixman-native \
    qemu-native \
    zlib-native \
"

BPN = "qemu"

SRC_URI = "\
    https://download.qemu.org/${BPN}-${PV}.tar.xz \
    file://powerpc_rom.bin \
    file://0001-qemu-Add-missing-wacom-HID-descriptor.patch \
    file://0003-qemu-Add-addition-environment-space-to-boot-loader-q.patch \
    file://0006-chardev-connect-socket-to-a-spawned-command.patch \
    file://0007-apic-fixup-fallthrough-to-PIC.patch \
    file://0010-configure-Add-pkg-config-handling-for-libgcrypt.patch \
    file://0001-qemu-Do-not-include-file-if-not-exists.patch \
    file://mmap2.patch \
    file://determinism.patch \
    file://0001-tests-meson.build-use-relative-path-to-refer-to-file.patch \
    file://0001-riscv-Set-5.4-as-minimum-kernel-version-for-riscv32.patch \
"
UPSTREAM_CHECK_REGEX = "qemu-(?P<pver>\d+(\.\d+)+)\.tar"

SRC_URI[sha256sum] = "68e15d8e45ac56326e0b9a4afa8b49a3dfe8aba3488221d098c84698bca65b45"

# Applies against virglrender < 0.6.0 and not qemu itself
CVE_CHECK_WHITELIST += "CVE-2017-5957"

# The VNC server can expose host files uder some circumstances. We don't
# enable it by default.
CVE_CHECK_WHITELIST += "CVE-2007-0998"

# 'The issues identified by this CVE were determined to not constitute a vulnerability.'
# https://bugzilla.redhat.com/show_bug.cgi?id=1609015#c11
CVE_CHECK_WHITELIST += "CVE-2018-18438"

COMPATIBLE_HOST:mipsarchn32 = "null"
COMPATIBLE_HOST:mipsarchn64 = "null"

# Per https://lists.nongnu.org/archive/html/qemu-devel/2020-09/msg03873.html
# upstream states qemu doesn't work without optimization
DEBUG_BUILD = "0"

inherit python3-dir
inherit pkgconfig
inherit native

# Disable kvm/virgl/mesa on targets that do not support it
PACKAGECONFIG:remove:darwin = "kvm virglrenderer glx gtk+"
PACKAGECONFIG:remove:mingw32 = "kvm virglrenderer glx gtk+"

PACKAGECONFIG[sdl] = "--enable-sdl,--disable-sdl,libsdl2"
PACKAGECONFIG[virtfs] = "--enable-virtfs --enable-attr --enable-cap-ng,--disable-virtfs,libcap-ng attr,"
PACKAGECONFIG[aio] = "--enable-linux-aio,--disable-linux-aio,libaio,"
PACKAGECONFIG[xfs] = "--enable-xfsctl,--disable-xfsctl,xfsprogs,"
PACKAGECONFIG[xen] = "--enable-xen,--disable-xen,xen-tools,xen-tools-libxenstore xen-tools-libxenctrl xen-tools-libxenguest"
PACKAGECONFIG[vnc-sasl] = "--enable-vnc --enable-vnc-sasl,--disable-vnc-sasl,cyrus-sasl,"
PACKAGECONFIG[vnc-jpeg] = "--enable-vnc --enable-vnc-jpeg,--disable-vnc-jpeg,jpeg,"
PACKAGECONFIG[vnc-png] = "--enable-vnc --enable-vnc-png,--disable-vnc-png,libpng,"
PACKAGECONFIG[libcurl] = "--enable-curl,--disable-curl,curl,"
PACKAGECONFIG[nss] = "--enable-smartcard,--disable-smartcard,nss,"
PACKAGECONFIG[curses] = "--enable-curses,--disable-curses,ncurses,"
PACKAGECONFIG[gtk+] = "--enable-gtk,--disable-gtk,gtk+3 gettext-native"
PACKAGECONFIG[vte] = "--enable-vte,--disable-vte,vte gettext-native"
PACKAGECONFIG[libcap-ng] = "--enable-cap-ng,--disable-cap-ng,libcap-ng,"
PACKAGECONFIG[ssh] = "--enable-libssh,--disable-libssh,libssh,"
PACKAGECONFIG[gcrypt] = "--enable-gcrypt,--disable-gcrypt,libgcrypt,"
PACKAGECONFIG[nettle] = "--enable-nettle,--disable-nettle,nettle"
PACKAGECONFIG[libusb] = "--enable-libusb,--disable-libusb,libusb1"
PACKAGECONFIG[fdt] = "--enable-fdt,--disable-fdt,dtc"
PACKAGECONFIG[alsa] = "--audio-drv-list=default,,alsa-lib"
PACKAGECONFIG[glx] = "--enable-opengl,--disable-opengl,virtual/libgl"
PACKAGECONFIG[lzo] = "--enable-lzo,--disable-lzo,lzo"
PACKAGECONFIG[numa] = "--enable-numa,--disable-numa,numactl"
PACKAGECONFIG[gnutls] = "--enable-gnutls,--disable-gnutls,gnutls"
PACKAGECONFIG[bzip2] = "--enable-bzip2,--disable-bzip2,bzip2"
PACKAGECONFIG[libiscsi] = "--enable-libiscsi,--disable-libiscsi"
PACKAGECONFIG[kvm] = "--enable-kvm,--disable-kvm"
PACKAGECONFIG[virglrenderer] = "--enable-virglrenderer,--disable-virglrenderer,virglrenderer"
# spice will be in meta-networking layer
PACKAGECONFIG[spice] = "--enable-spice,--disable-spice,spice"
# usbredir will be in meta-networking layer
PACKAGECONFIG[usb-redir] = "--enable-usb-redir,--disable-usb-redir,usbredir"
PACKAGECONFIG[snappy] = "--enable-snappy,--disable-snappy,snappy"
PACKAGECONFIG[glusterfs] = "--enable-glusterfs,--disable-glusterfs,glusterfs"
PACKAGECONFIG[xkbcommon] = "--enable-xkbcommon,--disable-xkbcommon,libxkbcommon"
PACKAGECONFIG[libudev] = "--enable-libudev,--disable-libudev,eudev"
PACKAGECONFIG[libxml2] = "--enable-libxml2,--disable-libxml2,libxml2"
PACKAGECONFIG[attr] = "--enable-attr,--disable-attr,attr,"
PACKAGECONFIG[rbd] = "--enable-rbd,--disable-rbd,ceph,ceph"
PACKAGECONFIG[vhost] = "--enable-vhost-net,--disable-vhost-net,,"
PACKAGECONFIG[ust] = "--enable-trace-backend=ust,--enable-trace-backend=nop,lttng-ust,"
PACKAGECONFIG[pie] = "--enable-pie,--disable-pie,,"
PACKAGECONFIG[seccomp] = "--enable-seccomp,--disable-seccomp,libseccomp"
PACKAGECONFIG[pulsedio] = "--enable-pa,--disable-pa,pulseaudio"

PACKAGECONFIG ??= ""

# Handle distros such as CentOS 5 32-bit that do not have kvm support
PACKAGECONFIG:remove = "${@'kvm' if not os.path.exists('/usr/include/linux/kvm.h') else ''}"

# QEMU_TARGETS is overridable variable
QEMU_TARGETS ?= "\
    arm \
    aarch64 \
    i386 \
    mips \
    mipsel \
    mips64 \
    mips64el \
    ppc \
    ppc64 \
    ppc64le \
    riscv32 \
    riscv64 \
    sh4 \
    x86_64 \
"

def get_qemu_target_list(d):
    import bb
    archs = d.getVar('QEMU_TARGETS').split()
    tos = d.getVar('HOST_OS')
    softmmuonly = ""
    for arch in ['ppcemb', 'lm32']:
        if arch in archs:
            softmmuonly += arch + "-softmmu,"
            archs.remove(arch)
    linuxuseronly = ""
    for arch in ['armeb', 'alpha', 'ppc64abi32', 'ppc64le', 'sparc32plus', 'aarch64_be']:
        if arch in archs:
            linuxuseronly += arch + "-linux-user,"
            archs.remove(arch)
    if 'linux' not in tos:
        return softmmuonly + ''.join([arch + "-softmmu" + "," for arch in archs]).rstrip(',')
    return softmmuonly + linuxuseronly + ''.join([arch + "-linux-user" + "," + arch + "-softmmu" + "," for arch in archs]).rstrip(',')

def get_qemu_usermode_target_list(d):
    return ",".join(filter(lambda i: "-linux-user" in i, get_qemu_target_list(d).split(',')))

EXTRA_OECONF = "\
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
    --with-suffix=${BPN} \
    --disable-strip \
    --disable-werror \
    --extra-cflags='${CFLAGS}' \
    --extra-ldflags='${LDFLAGS}' \
    --with-git=/bin/false \
    --with-git-submodules=ignore \
    --meson=meson \
    --static \
    --disable-system \
    --enable-linux-user \
    --disable-tools \
    --disable-blobs \
    --disable-guest-agent \
    ${PACKAGECONFIG_CONFARGS} \
    --target-list=${@get_qemu_usermode_target_list(d)} \
    "
EXTRA_OECONF:remove = "--disable-static"

export LIBTOOL="${HOST_SYS}-libtool"
EXTRA_OEMAKE:append = " LD='${LD}' AR='${AR}' OBJCOPY='${OBJCOPY}' LDFLAGS='${LDFLAGS}'"
LDFLAGS:append = " -fuse-ld=bfd"

B = "${WORKDIR}/build"

do_configure() {
    # Append build host pkg-config paths for native target since the host may provide sdl
    BHOST_PKGCONFIG_PATH=$(PATH=/usr/bin:/bin pkg-config --variable pc_path pkg-config || echo "")
    if [ ! -z "$BHOST_PKGCONFIG_PATH" ]; then
        export PKG_CONFIG_PATH=$PKG_CONFIG_PATH:$BHOST_PKGCONFIG_PATH
    fi
    ${S}/configure ${EXTRA_OECONF}
}
do_configure[cleandirs] += "${B}"

do_install () {
    export STRIP=""
    oe_runmake 'DESTDIR=${D}' install

    ## remove all the stuff we don't need
    ## we just want the binaries, nothing more
    rm -rf ${D}${datadir}
    rm -rf ${D}${localstatedir}

    ## Rename the binaries to *-static
    find ${D} -executable -type f -exec mv {} {}-static \;
}

FILES:${PN} = "${bindir}"

INSANE_SKIP:${PN} = "arch"
