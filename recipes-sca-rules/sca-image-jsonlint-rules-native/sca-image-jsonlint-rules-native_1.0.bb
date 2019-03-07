SUMMARY = "Ruleset for jsonlint"
DESCRIPTION = " Rules to configure how jsonlint is affecting the build"

SRC_URI = "file://fatal"

LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/jsonlint-image-fatal"
}

FILES_${PN} = "${datadir}/**"