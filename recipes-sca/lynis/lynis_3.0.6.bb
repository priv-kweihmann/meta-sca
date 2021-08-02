SUMMARY = "Security auditing tool for Linux, macOS, and UNIX-based systems"
HOMEPAGE = "https://github.com/CISOfy/lynis"

LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3edd6782854304fd11da4975ab9799c1"

DEPENDS_class_native += "${BPN}"

SRC_URI = "git://github.com/CISOfy/lynis.git;protocol=https \
           file://lynis.sca.description"
SRCREV = "c89fc248dc9f49d3931c4b05ac0cdf093d87ec40"
S = "${WORKDIR}/git"

inherit autotools-brokensep
inherit sca-description

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install:class-native () {
    install -d ${D}/${datadir}
    install ${WORKDIR}/lynis.sca.description ${D}${datadir}
}

do_install:class-target () {
    install -d ${D}/${bindir}
    install -d ${D}/${sysconfdir}/lynis
    install -m 555 ${S}/lynis ${D}/${bindir}

    install -d ${D}/${datadir}/lynis/db
    install -d ${D}/${datadir}/lynis/plugins
    install -d ${D}/${datadir}/lynis/include
    install -d ${D}/${datadir}/lynis/extras

    cp -r ${S}/db/* ${D}/${datadir}/lynis/db/.
    cp -r ${S}/plugins/*  ${D}/${datadir}/lynis/plugins/.
    cp -r ${S}/include/* ${D}/${datadir}/lynis/include/.
    cp -r ${S}/extras/*  ${D}/${datadir}/lynis/extras/.
    cp ${S}/*.prf ${D}/${sysconfdir}/lynis
}

FILES:${PN}:class-native = "${datadir}"
FILES:${PN}:class-target = "${datadir} ${sysconfdir} ${bindir}"

RDEPENDS:${PN}:class-target += "procps"

BBCLASSEXTEND = "native"
