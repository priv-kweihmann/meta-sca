SUMMARY = "SCA description for golint"

SRC_URI = "file://golint.sca.description \
           file://golint.sca.score"

LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

inherit native

FILES_${PN} = "${datadir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

DEPENDS += "golang.org-x-lint-native"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/golint.sca.description ${D}${datadir}/
    install ${WORKDIR}/golint.sca.score ${D}${datadir}/
}

