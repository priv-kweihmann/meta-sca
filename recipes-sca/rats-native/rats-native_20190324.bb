SUMMARY = "Rough Auditing Tool For Security"
DESCRIPTION = "Rough Auditing Tool For Security"

SRC_URI = "git://github.com/redNixon/rats.git;protocol=https;branch=master \
           file://rats.sca.description"

SRCREV = "6bb2d62938156ecd16afb4ee4af9eeb98d9b5f06"
UPSTREAM_CHECK_COMMITS = "1"

LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

HOMEPAGE = "https://github.com/redNixon/rats"
LICENSE = "GPLv2"

S = "${WORKDIR}/git"

FILES_${PN} = "${bindir} ${incdir} ${datadir} ${libdir}"

inherit autotools-brokensep
inherit native
inherit sca-sanity

do_install() {
    mkdir -p ${D}/${bindir}
    mkdir -p ${D}/${mandir}
    mkdir -p ${D}/${datadir}

    install ${B}/rats ${D}${bindir}/
    install ${B}/rats-python.xml ${D}/${datadir}
    install ${B}/rats-c.xml ${D}/${datadir}
    install ${B}/rats-perl.xml ${D}/${datadir}
    install ${B}/rats-php.xml ${D}/${datadir}
    install ${B}/rats-ruby.xml ${D}/${datadir}
    install ${B}/rats-openssl.xml ${D}/${datadir}
    install ${B}/rats.1    ${D}/${mandir}/man1

    install ${WORKDIR}/rats.sca.description ${D}${datadir}/
}


DEPENDS = "expat-native"
