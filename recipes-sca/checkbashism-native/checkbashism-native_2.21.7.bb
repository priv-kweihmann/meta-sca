SUMMARY = "check for bashisms in /bin/sh scripts"
HOMEPAGE = "https://salsa.debian.org/debian/devscripts"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPLv2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=faa39cbd7a7cded9a1436248295de3c2"

DEPENDS += "perl-native"

SRC_URI:append = " \
    http://deb.debian.org/debian/pool/main/d/devscripts/devscripts_${PV}.tar.xz \
    file://checkbashism.sca.description \
"

SRC_URI[sha256sum] = "b03ae9a3214ea5492aa51519deddf0d46f8e59996b66aea1ed0dc1a1c5466ab1"

S = "${WORKDIR}/devscripts-${PV}"
UPSTREAM_CHECK_REGEX = "devscripts_(?P<pver>\d+\.\d+\.\d+)"

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

FILES:${PN} += "${bindir} ${datadir}"
