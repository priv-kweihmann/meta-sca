SUMMARY = "check for bashisms in /bin/sh scripts"
HOMEPAGE = "https://salsa.debian.org/debian/devscripts"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=faa39cbd7a7cded9a1436248295de3c2"

DEPENDS += "perl-native"

SRC_URI:append = " \
    git://salsa.debian.org/debian/devscripts.git;protocol=https;branch=main \
    file://checkbashism.sca.description \
"
SRCREV = "05d95a967cc68a85621430c1b2a14b68299d1f44"

UNPACKDIR ??= "${WORKDIR}/sources"
UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+\.\d+\.\d+)"

inherit sca-description
inherit_defer native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

SCA_TOOL_DESCRIPTION = "checkbashism"

do_install() {
    install -d ${D}${bindir}

    install -m 0755 ${S}/scripts/checkbashisms.bash_completion ${D}${bindir}
    install -m 0755 ${S}/scripts/checkbashisms.pl ${D}${bindir}
    # enforce usage of sysroot perl instead of host sided
    sed -i "s|/usr/bin/perl|/usr/bin/env perl|g" ${D}${bindir}/checkbashisms.pl
}

FILES:${PN} += "${bindir}"

RDEPENDS:${PN}:class-nativesdk += "nativesdk-perl"
