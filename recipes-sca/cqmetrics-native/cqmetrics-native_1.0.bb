SUMMARY = "C Quality Metrics "
DESCRIPTION = "C Quality Metrics "

HOMEPAGE = "https://github.com/dspinellis/cqmetrics"
LICENSE = "Apache-2.0"

SRC_URI = "git://github.com/dspinellis/cqmetrics.git;protocol=https;tag=v${PV} \
           file://cqmetrics.sca.description \
           file://cqmetrics.sca.score"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a5fe6ab9b4eca142b97e9cda74fcd704"

inherit native
inherit pkgconfig

S = "${WORKDIR}/git"

do_compile() {
    cd src/
	oe_runmake
    cd -
}

FILES_${PN} = "${bindir} ${datadir}"

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${datadir}
    install -m 0755 ${S}/src/qmcalc ${D}${bindir}
    install ${S}/src/*.sh ${D}${bindir}
    install ${S}/src/header.tab ${D}${bindir}
    install ${WORKDIR}/cqmetrics.sca.description ${D}${datadir}
    install ${WORKDIR}/cqmetrics.sca.score ${D}${datadir}
}
