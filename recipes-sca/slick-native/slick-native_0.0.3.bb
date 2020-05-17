SUMMARY = "a CI-ready shell language syntax checker"
HOMEPAGE = "https://github.com/mcandre/slick"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=6a55da1ae5d911566ba1a841e39c5a42"

DEPENDS += "github.com-mvdan-sh-native"

SRC_URI = "\
            git://${GO_IMPORT};protocol=https \
            file://slick.sca.description \
           "
SRCREV = "203ddaad33fd816efa0adb64fc1f42c216e592a0"
GO_IMPORT = "github.com/mcandre/slick"

inherit go
inherit native
inherit sca-description

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/slick.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
