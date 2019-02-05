SUMMARY = "Ruleset for cpplint"
DESCRIPTION = " Rules to configured how cpplint is affecting the build"

SRC_URI = "file://suppress \
           file://fatal"

LICENSE = "CLOSED"

BBCLASSEXTEND = "native"

## Don't cache - always make it clean
BB_DONT_CACHE = "1"

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/cpplint-fatal"
    install "${WORKDIR}/suppress" "${D}${datadir}/cpplint-suppress"
}

FILES_${PN} = "${datadir}/**"