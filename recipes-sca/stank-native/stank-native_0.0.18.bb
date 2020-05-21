SUMMARY = "Find rotten POSIX shell scripts"
DESCRIPTION = "stank: analyzers for determining whether files smell like rotten POSIX shell scripts, or faintly rosy like Ruby and Python scripts"
HOMEPAGE = "https://github.com/mcandre/stank"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=6a55da1ae5d911566ba1a841e39c5a42"

DEPENDS += "\
            mvdan.cc-sh-native \
           "

SRC_URI = "\
           git://${GO_IMPORT};protocol=https \
           file://stank.sca.description \
           "
SRCREV = "f5ae13b60217885c0055ce19a19fe471a413a1a3"
GO_IMPORT = "github.com/mcandre/stank"

inherit go
inherit native
inherit sca-description

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/stank.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
