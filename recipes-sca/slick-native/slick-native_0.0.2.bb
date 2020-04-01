SUMMARY = "a CI-ready shell language syntax checker"
HOMEPAGE = "https://github.com/mcandre/slick"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=4b1b7334dfc9809f7b03c0d24e6e58c0"

DEPENDS += "github.com-mvdan-sh-native"

SRC_URI = "file://slick.sca.description \
           git://${GO_IMPORT};protocol=https;tag=v${PV}"

GO_IMPORT = "github.com/mcandre/slick"

inherit go
inherit native
inherit sca-sanity

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/slick.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
