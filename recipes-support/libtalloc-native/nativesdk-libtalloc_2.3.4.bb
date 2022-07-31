# This file is a modified version of files to be found at
# https://git.openembedded.org/meta-openembedded/plain/meta-networking/recipes-support/libtalloc/
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
SUMMARY = "Hierarchical, reference counted memory pool system with destructors"
HOMEPAGE = "http://talloc.samba.org"
SECTION = "libs"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-or-later & GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://talloc.h;beginline=3;endline=27;md5=a301712782cad6dd6d5228bfa7825249 \
                    file://pytalloc.h;beginline=1;endline=21;md5=9d920c60ee5cc42bee41eaf506c9fa1c"

DEPENDS += "\
    nativesdk-docbook-xsl-stylesheets \
    nativesdk-libxslt \
    nativesdk-python3 \
    nativesdk-qemu \
"

SRC_URI = "https://www.samba.org/ftp/talloc/talloc-${PV}.tar.gz \
           file://0001-talloc-Add-configure-options-for-packages.patch \
           file://0002-waf-add-support-of-cross_compile.patch \
"
SRC_URI += "${@bb.utils.contains('PACKAGECONFIG', 'attr', '', 'file://avoid-attr-unless-wanted.patch', d)}"

SRC_URI[sha256sum] = "179f9ebe265e67e4ab2c26cad2b7de4b6a77c6c212f966903382869f06be6505"

S = "${WORKDIR}/talloc-${PV}"

# The following includes a stripped version of waf-samba.bbclass from
# http://cgit.openembedded.org/meta-openembedded/tree/meta-networking/classes/waf-samba.bbclass

inherit qemu
inherit python3native
inherit nativesdk

PACKAGECONFIG ??= "\
                   ${@bb.utils.filter('DISTRO_FEATURES', 'acl', d)} \
                   ${@bb.utils.contains('DISTRO_FEATURES', 'xattr', 'attr', '', d)} \
                  "
PACKAGECONFIG[acl] = "--with-acl,--without-acl,acl"
PACKAGECONFIG[attr] = "--with-attr,--without-attr,attr"
PACKAGECONFIG[libaio] = "--with-libaio,--without-libaio,libaio"
PACKAGECONFIG[libbsd] = "--with-libbsd,--without-libbsd,libbsd"
PACKAGECONFIG[libcap] = "--with-libcap,--without-libcap,libcap"
PACKAGECONFIG[valgrind] = "--with-valgrind,--without-valgrind,valgrind"

#cross_compile cannot use preforked process, since fork process earlier than point subproces.popen
#to cross Popen
export WAF_NO_PREFORK="yes"

CONFIGUREOPTS = "--prefix=${prefix} \
                 --bindir=${bindir} \
                 --sbindir=${sbindir} \
                 --libexecdir=${libexecdir} \
                 --datadir=${datadir} \
                 --sysconfdir=${sysconfdir} \
                 --sharedstatedir=${sharedstatedir} \
                 --localstatedir=${localstatedir} \
                 --libdir=${libdir} \
                 --includedir=${includedir} \
                 --oldincludedir=${oldincludedir} \
                 --infodir=${infodir} \
                 --mandir=${mandir} \
                 ${PACKAGECONFIG_CONFARGS} \
                "

EXTRA_OECONF += "--disable-rpath \
                 --disable-rpath-install \
                 --bundled-libraries=NONE \
                 --builtin-libraries=replace \
                 --disable-silent-rules \
                 --with-libiconv=${STAGING_DIR_HOST}${prefix}\
                "

# avoids build breaks when using no-static-libs.inc
DISABLE_STATIC = ""

## Original function from waf-samba isn't supporting
def get_waf_parallel_make(d):
    pm = d.getVar('PARALLEL_MAKE')
    if pm:
        # look for '-j' and throw other options (e.g. '-l') away
        # because they might have different meaning in bjam
        pm = pm.split()
        while pm:
            opt = pm.pop(0)
            if opt == '-j':
                v = pm.pop(0)
            elif opt.startswith('-j'):
                v = opt[2:].strip()
            else:
                continue
            v = min(64, int(v))
            return '-j' + str(v)
    return ""

## native build, so let's just override it here
do_configure() {
    export BUILD_ARCH=${BUILD_ARCH}
    export HOST_ARCH=${HOST_ARCH}
    export STAGING_LIBDIR=${STAGING_LIBDIR}
    export STAGING_INCDIR=${STAGING_INCDIR}
    export PYTHONPATH=${STAGING_DIR_HOST}${PYTHON_SITEPACKAGES_DIR}

    ./configure ${CONFIGUREOPTS} ${EXTRA_OECONF}
}

do_compile[progress] = "outof:^\[\s*(\d+)/\s*(\d+)\]\s+"
do_compile() {
    PYTHON=python3 oe_runmake
}

do_install() {
    oe_runmake install DESTDIR=${D}
}

PACKAGES += "pytalloc pytalloc-dev"

RDEPENDS:pytalloc = "nativesdk-python3"

RPROVIDES:${PN}-dbg += "nativesdk-pytalloc-dbg"

FILES:pytalloc = "${libdir}/python${PYTHON_BASEVERSION}/site-packages \
                  ${libdir}/libpytalloc-util.so.2 \
                  ${libdir}/libpytalloc-util.so.2.1.1 \
                 "
FILES:pytalloc-dev = "${libdir}/libpytalloc-util.so"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-docbook-xsl-stylesheets \
    nativesdk-libxslt \
    nativesdk-python3 \
    nativesdk-qemu \
"
