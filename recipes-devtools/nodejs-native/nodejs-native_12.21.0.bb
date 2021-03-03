# This file is a modified version of the one to be found at
# https://git.openembedded.org/meta-openembedded/commit/?h=master-next&id=4c4db545bf203c989d98afda860c762f79c64f5e
#
# The recipe and the provided patches are licensed under the following terms
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:

# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.

# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
# THE SOFTWARE.

DESCRIPTION = "nodeJS Evented I/O for V8 JavaScript"
HOMEPAGE = "http://nodejs.org"
LICENSE = "MIT & BSD & Artistic-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8c66ff8861d9f96076a7cb61e3d75f54"

DEPENDS += "\
            bash-native \
            openssl-native \
            python3-native \
           "

SRC_URI = "http://nodejs.org/dist/v${PV}/node-v${PV}.tar.xz \
           file://0001-Disable-running-gyp-files-for-bundled-deps.patch \
           file://0005-Install-both-binaries-and-use-libdir.patch \
           file://0003-v8-don-t-override-ARM-CFLAGS.patch \
           file://0004-Bind-python-to-nativepython3.patch \
           "

SRC_URI[md5sum] = "e75fe6122e50b8ddb943eac1742df056"
SRC_URI[sha256sum] = "052f37ace6f569b513b5a1154b2a45d3c4d8b07d7d7c807b79f1566db61e979d"

S = "${WORKDIR}/node-v${PV}"

inherit pkgconfig python3native native

COMPATIBLE_MACHINE_armv4 = "(!.*armv4).*"
COMPATIBLE_MACHINE_armv5 = "(!.*armv5).*"
COMPATIBLE_MACHINE_mips64 = "(!.*mips64).*"

COMPATIBLE_HOST_riscv64 = "null"
COMPATIBLE_HOST_riscv32 = "null"

UPSTREAM_CHECK_REGEX = "(?P<pver>12\.\d+\.\d+)"

# v8 errors out if you have set CCACHE
CCACHE = ""

def map_nodejs_arch(a, d):
    import re
    
    if   re.match('i.86$', a): return 'ia32'
    elif re.match('x86_64$', a): return 'x64'
    elif re.match('aarch64$', a): return 'arm64'
    elif re.match('(powerpc64|ppc64le)$', a): return 'ppc64'
    elif re.match('powerpc$', a): return 'ppc'
    return a

ARCHFLAGS_arm = "${@bb.utils.contains('TUNE_FEATURES', 'callconvention-hard', '--with-arm-float-abi=hard', '--with-arm-float-abi=softfp', d)} \
                 ${@bb.utils.contains('TUNE_FEATURES', 'neon', '--with-arm-fpu=neon', \
                 bb.utils.contains('TUNE_FEATURES', 'vfpv3d16', '--with-arm-fpu=vfpv3-d16', \
                 bb.utils.contains('TUNE_FEATURES', 'vfpv3', '--with-arm-fpu=vfpv3', \
                 '--with-arm-fpu=vfp', d), d), d)}"
GYP_DEFINES_append_mipsel = " mips_arch_variant='r1' "
ARCHFLAGS ?= ""

PACKAGECONFIG ??= "icu zlib"
PACKAGECONFIG[ares] = "--shared-cares,,c-ares"
PACKAGECONFIG[gyp] = ",,gyp-py2-native"
PACKAGECONFIG[icu] = "--with-intl=system-icu,--without-intl,icu"
PACKAGECONFIG[libuv] = "--shared-libuv,,libuv"
PACKAGECONFIG[nghttp2] = "--shared-nghttp2,,nghttp2"
PACKAGECONFIG[shared] = "--shared"
PACKAGECONFIG[zlib] = "--shared-zlib,,zlib"

# We don't want to cross-compile during target compile,
# and we need to use the right flags during host compile,
# too.
EXTRA_OEMAKE = "\
                CC.host='${CC}' \
                CFLAGS.host='${CPPFLAGS} ${CFLAGS}' \
                CXX.host='${CXX}' \
                CXXFLAGS.host='${CPPFLAGS} ${CXXFLAGS}' \
                LDFLAGS.host='${LDFLAGS}' \
                AR.host='${AR}' \
                builddir_name=./ \
"

python do_unpack() {
    import shutil

    bb.build.exec_func('base_do_unpack', d)

    shutil.rmtree(d.getVar('S') + '/deps/openssl', True)
    if 'ares' in d.getVar('PACKAGECONFIG'):
        shutil.rmtree(d.getVar('S') + '/deps/cares', True)
    if 'gyp' in d.getVar('PACKAGECONFIG'):
        shutil.rmtree(d.getVar('S') + '/tools/gyp', True)
    if 'libuv' in d.getVar('PACKAGECONFIG'):
        shutil.rmtree(d.getVar('S') + '/deps/uv', True)
    if 'nghttp2' in d.getVar('PACKAGECONFIG'):
        shutil.rmtree(d.getVar('S') + '/deps/nghttp2', True)
    if 'zlib' in d.getVar('PACKAGECONFIG'):
        shutil.rmtree(d.getVar('S') + '/deps/zlib', True)
}

# Node is way too cool to use proper autotools, so we install two wrappers to forcefully inject proper arch cflags to workaround gypi
do_configure () {
    export LD="${CXX}"
    GYP_DEFINES="${GYP_DEFINES}" export GYP_DEFINES
    # $TARGET_ARCH settings don't match --dest-cpu settings
    # run configure.py through native python to work around
    # some crude stuff done in the original configure script
    nativepython3 configure.py --prefix=${prefix} --without-snapshot --shared-openssl \
               --dest-cpu="${@map_nodejs_arch(d.getVar('TARGET_ARCH'), d)}" \
               --dest-os=linux \
               --libdir=${D}${libdir} \
               ${ARCHFLAGS} \
               ${PACKAGECONFIG_CONFARGS}
}

do_compile () {
    export LD="${CXX}"
    oe_runmake BUILDTYPE=Release
}

do_install () {
    oe_runmake install DESTDIR=${D}

    # use node from PATH instead of absolute path to sysroot
    # node-v0.10.25/tools/install.py is using:
    # shebang = os.path.join(node_prefix, 'bin/node')
    # update_shebang(link_path, shebang)
    # and node_prefix can be very long path to bindir in native sysroot and
    # when it exceeds 128 character shebang limit it's stripped to incorrect path
    # and npm fails to execute like in this case with 133 characters show in log.do_install:
    # updating shebang of /home/jenkins/workspace/build-webos-nightly/device/qemux86/label/open-webos-builder/BUILD-qemux86/work/x86_64-linux/nodejs-native/0.10.15-r0/image/home/jenkins/workspace/build-webos-nightly/device/qemux86/label/open-webos-builder/BUILD-qemux86/sysroots/x86_64-linux/usr/bin/npm to /home/jenkins/workspace/build-webos-nightly/device/qemux86/label/open-webos-builder/BUILD-qemux86/sysroots/x86_64-linux/usr/bin/node
    # /usr/bin/npm is symlink to /usr/lib/node_modules/npm/bin/npm-cli.js
    # use sed on npm-cli.js because otherwise symlink is replaced with normal file and
    # npm-cli.js continues to use old shebang
    sed "1s^.*^#\!/usr/bin/env node^g" -i ${D}${exec_prefix}/lib/node_modules/npm/bin/npm-cli.js

    # Install the native binaries to provide it within sysroot for the target compilation
    install -d ${D}${bindir}
    install -m 0755 ${S}/out/Release/torque ${D}${bindir}/torque
    install -m 0755 ${S}/out/Release/bytecode_builtins_list_generator ${D}${bindir}/bytecode_builtins_list_generator
    install -m 0755 ${S}/out/Release/gen-regexp-special-case ${D}${bindir}/gen-regexp-special-case
    install -m 0755 ${S}/out/Release/mkcodecache ${D}${bindir}/mkcodecache
    install -m 0755 ${S}/out/Release/node_mksnapshot ${D}${bindir}/node_mksnapshot
}

FILES_${PN} = "${exec_prefix}/lib/node_modules ${bindir}/npm ${bindir}/npx ${datadir}/systemtap"
