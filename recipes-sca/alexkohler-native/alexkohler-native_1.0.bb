SUMMARY = "Alex Kohler static go analyzer tools"
HOMEPAGE = "https://github.com/alexkohler"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "\
            github.com-alexkohler-dogsled-native \
            github.com-alexkohler-identypo-native \
            github.com-alexkohler-nakedret-native \
            github.com-alexkohler-nargs-native \
            github.com-alexkohler-noret-native \
            github.com-alexkohler-prealloc-native \
            github.com-alexkohler-unimport-native \
           "

SRC_URI = "file://alexkohler.sca.description"

inherit sca-description
inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/alexkohler.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
