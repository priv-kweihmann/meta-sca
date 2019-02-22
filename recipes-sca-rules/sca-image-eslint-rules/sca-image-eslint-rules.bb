SUMMARY = "Ruleset for eslint"
DESCRIPTION = " Rules to configure how eslint is affecting the build"

SRC_URI = "file://suppress \
           file://fatal"

LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

BBCLASSEXTEND = "native"

## Don't cache - always make it clean
BB_DONT_CACHE = "1"

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/suppress" "${D}${datadir}/eslint-suppress"
    install "${WORKDIR}/fatal" "${D}${datadir}/eslint-fatal"
}

FILES_${PN} = "${datadir}/**"