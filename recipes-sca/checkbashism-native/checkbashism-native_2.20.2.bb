SUMMARY = "check for bashisms in /bin/sh scripts "
DESCRIPTION = "check for bashisms in /bin/sh scripts "

HOMEPAGE = "https://salsa.debian.org/debian/devscripts"
LICENSE = "GPLv2.0"

SRC_URI = "git://salsa.debian.org/debian/devscripts.git;protocol=https;tag=v${PV} \
           file://checkbashism.sca.description"

S = "${WORKDIR}/git"
B = "${S}"

LIC_FILES_CHKSUM = "file://COPYING;md5=faa39cbd7a7cded9a1436248295de3c2"

inherit native
inherit sca-sanity

DEPENDS = "perl-native"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

FILES_${PN} = "${bindir} ${datadir}"

do_install() {
    mkdir -p ${D}${bindir}
    install -d ${D}${datadir}

    install -m 0755 ${S}/scripts/checkbashisms.bash_completion ${D}${bindir}
    install -m 0755 ${S}/scripts/checkbashisms.pl ${D}${bindir}

    install ${WORKDIR}/checkbashism.sca.description ${D}${datadir}
}
