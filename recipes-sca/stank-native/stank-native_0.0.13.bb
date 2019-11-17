SUMMARY = "stank: analyzers for determining whether files smell like rotten POSIX shell scripts, or faintly rosy like Ruby and Python scripts"
HOMEPAGE = "https://github.com/mcandre/stank"

SRC_URI = "file://stank.sca.description \
           file://stank.sca.score \
           git://${GO_IMPORT};protocol=https;tag=v${PV}"

GO_IMPORT = "github.com/mcandre/stank"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE.md;md5=4b1b7334dfc9809f7b03c0d24e6e58c0"

inherit go
inherit native
inherit sca-sanity

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/stank.sca.description ${D}${datadir}/
    install ${WORKDIR}/stank.sca.score ${D}${datadir}/
}

