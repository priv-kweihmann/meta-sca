SUMMARY = "Ruleset for shellcheck"
DESCRIPTION = " Rules to configured how shellcheck is affecting the build"

SRC_URI = "file://suppress \
           file://fatal"

LICENSE = "CLOSED"

BBCLASSEXTEND = "native"

## Don't cache - always make it clean
BB_DONT_CACHE = "1"

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/suppress" "${D}${datadir}/shellcheck-suppress"
    install "${WORKDIR}/fatal" "${D}${datadir}/shellcheck-fatal"
}

FILES_${PN} = "${datadir}/**"