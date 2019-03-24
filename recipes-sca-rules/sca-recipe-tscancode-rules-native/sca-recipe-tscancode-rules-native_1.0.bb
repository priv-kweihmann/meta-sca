SUMMARY = "Ruleset for tscancode"
DESCRIPTION = " Rules to configure how tscancode is affecting the build"

SRC_URI = "file://suppress \
           file://fatal"

LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/tscancode-recipe-fatal"
    install "${WORKDIR}/suppress" "${D}${datadir}/tscancode-recipe-suppress"
}

FILES_${PN} = "${datadir}/**"