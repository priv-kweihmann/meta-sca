SUMMARY = "Ruleset for gcc"
DESCRIPTION = " Rules to configure how gcc is affecting the build"

SRC_URI = "file://suppress \
           file://fatal"

LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

BBCLASSEXTEND = "native"

## Don't cache - always make it clean
BB_DONT_CACHE = "1"

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/gcc-fatal"
    install "${WORKDIR}/suppress" "${D}${datadir}/gcc-suppress"
}

FILES_${PN} = "${datadir}/**"