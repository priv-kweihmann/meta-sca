SUMMARY = "Ruleset for pytype"
DESCRIPTION = " Rules to configure how pytype is affecting the build"
AUTHOR = "Konrad Weihmann <kweihmann@outlook.com>"

SRC_URI = "file://suppress \
           file://fatal"

LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/pytype-recipe-fatal"
    install "${WORKDIR}/suppress" "${D}${datadir}/pytype-recipe-suppress"
}

FILES_${PN} = "${datadir}/**"