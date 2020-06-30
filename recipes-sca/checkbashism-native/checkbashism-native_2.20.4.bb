SUMMARY = "check for bashisms in /bin/sh scripts "
DESCRIPTION = "check for bashisms in /bin/sh scripts "
HOMEPAGE = "https://salsa.debian.org/debian/devscripts"

LICENSE = "GPLv2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=faa39cbd7a7cded9a1436248295de3c2"

DEPENDS += "perl-native"

SRC_URI = "git://salsa.debian.org/debian/devscripts.git;protocol=https \
           file://checkbashism.sca.description"
SRCREV = "ec1fcb6ac9d4dc20f5d452949c44ef32094b41d1"

S = "${WORKDIR}/git"

inherit native
inherit sca-description

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${datadir}

    install -m 0755 ${S}/scripts/checkbashisms.bash_completion ${D}${bindir}
    install -m 0755 ${S}/scripts/checkbashisms.pl ${D}${bindir}

    install ${WORKDIR}/checkbashism.sca.description ${D}${datadir}
}

FILES_${PN} = "${bindir} ${datadir}"
