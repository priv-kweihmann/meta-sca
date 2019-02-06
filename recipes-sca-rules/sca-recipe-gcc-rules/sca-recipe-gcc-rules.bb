SUMMARY = "Ruleset for gcc"
DESCRIPTION = " Rules to configure how gcc is affecting the build"

SRC_URI = "file://suppress \
           file://fatal"

LICENSE = "CLOSED"

BBCLASSEXTEND = "native"

## Don't cache - always make it clean
BB_DONT_CACHE = "1"

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/gcc-fatal"
    install "${WORKDIR}/suppress" "${D}${datadir}/gcc-suppress"
}

FILES_${PN} = "${datadir}/**"