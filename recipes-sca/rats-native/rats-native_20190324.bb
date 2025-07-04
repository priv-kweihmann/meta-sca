SUMMARY = "Rough Auditing Tool For Security"
HOMEPAGE = "https://github.com/redNixon/rats"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS += "expat-native"

SRC_URI = "git://github.com/redNixon/rats.git;protocol=https;branch=master \
           file://0001-Makefile.in-respect-datarootdir.patch"

SRCREV = "6bb2d62938156ecd16afb4ee4af9eeb98d9b5f06"
UPSTREAM_CHECK_COMMITS = "1"


inherit autotools-brokensep
inherit sca-description
inherit_defer native

SCA_TOOL_DESCRIPTION = "rats"

do_install() {
    install -d ${D}/${bindir}
    install -d ${D}/${mandir}
    install -d ${D}/${datadir}

    install ${B}/rats ${D}${bindir}/
    install ${B}/rats-python.xml ${D}/${datadir}
    install ${B}/rats-c.xml ${D}/${datadir}
    install ${B}/rats-perl.xml ${D}/${datadir}
    install ${B}/rats-php.xml ${D}/${datadir}
    install ${B}/rats-ruby.xml ${D}/${datadir}
    install ${B}/rats-openssl.xml ${D}/${datadir}
    install ${B}/rats.1    ${D}/${mandir}/man1
}

FILES:${PN} += "${bindir} ${incdir} ${datadir} ${libdir}"

RDEPENDS:${PN}:class-nativesdk += "nativesdk-expat"
