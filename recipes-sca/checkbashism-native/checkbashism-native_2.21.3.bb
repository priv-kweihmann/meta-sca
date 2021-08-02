SUMMARY = "check for bashisms in /bin/sh scripts "
DESCRIPTION = "check for bashisms in /bin/sh scripts "
HOMEPAGE = "https://salsa.debian.org/debian/devscripts"

LICENSE = "GPLv2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=faa39cbd7a7cded9a1436248295de3c2"

DEPENDS += "perl-native"

SRC_URI = "git://salsa.debian.org/debian/devscripts.git;protocol=https \
           file://checkbashism.sca.description"
SRCREV = "18077565df53e37262eb2691c4067175e90f7ec7"

S = "${WORKDIR}/git"

inherit sca-description
inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${datadir}

    install -m 0755 ${S}/scripts/checkbashisms.bash_completion ${D}${bindir}
    install -m 0755 ${S}/scripts/checkbashisms.pl ${D}${bindir}
    # enforce usage of sysroot perl instead of host sided
    sed -i "s|/usr/bin/perl|/usr/bin/env perl|g" ${D}${bindir}/checkbashisms.pl

    install ${WORKDIR}/checkbashism.sca.description ${D}${datadir}
}

FILES:${PN} = "${bindir} ${datadir}"
