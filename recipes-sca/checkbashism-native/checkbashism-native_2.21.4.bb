SUMMARY = "check for bashisms in /bin/sh scripts"
HOMEPAGE = "https://salsa.debian.org/debian/devscripts"

LICENSE = "GPLv2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=faa39cbd7a7cded9a1436248295de3c2"

DEPENDS += "perl-native"

SRC_URI:append = " \
    https://salsa.debian.org/debian/devscripts/-/blob/v${PV}/scripts/checkbashisms.pl;name=script;downloadfilename=checkbashisms.pl.${PV} \
    https://salsa.debian.org/debian/devscripts/-/blob/v${PV}/scripts/checkbashisms.bash_completion;name=bashcomp;downloadfilename=checkbashisms.bash_completion.${PV} \
    https://salsa.debian.org/debian/devscripts/-/blob/v${PV}/COPYING;name=license;downloadfilename=checkbashisms.license.${PV} \
    file://checkbashism.sca.description \
"

SRC_URI[script.sha256sum] = "a64e4714529e78a9117915b5bf2c5515262170c1bbd63db2a3b41afc1cc83ff7"
SRC_URI[bashcomp.sha256sum] = "09345df34fc65c4ab4c00d8f4e4df82b1dcc8ddc6097cac40496010185a2333c"
SRC_URI[license.sha256sum] = "09345df34fc65c4ab4c00d8f4e4df82b1dcc8ddc6097cac40496010185a2333c"

UPSTREAM_CHECK_URI = "https://salsa.debian.org/debian/devscripts/-/tags"
UPSTREAM_CHECK_REGEX = "tags/v(?P<pver>\d+\.\d+\.\d+)"

S = "${WORKDIR}"

inherit sca-description
inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${datadir}

    install -m 0755 ${WORKDIR}/checkbashisms.bash_completion ${D}${bindir}
    install -m 0755 ${WORKDIR}/checkbashisms.pl ${D}${bindir}
    # enforce usage of sysroot perl instead of host sided
    sed -i "s|/usr/bin/perl|/usr/bin/env perl|g" ${D}${bindir}/checkbashisms.pl

    install ${WORKDIR}/checkbashism.sca.description ${D}${datadir}
}

FILES:${PN} += "${bindir} ${datadir}"
