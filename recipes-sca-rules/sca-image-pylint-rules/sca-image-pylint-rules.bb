SUMMARY = "Ruleset for pylint on image-level"
DESCRIPTION = " Rules to configured how pylint is affecting the build"
AUTHOR = "Konrad Weihmann <kweihmann@phoenixcontact.com>"

SRC_URI = "file://suppress \
           file://fatal"

LICENSE = "CLOSED"

BBCLASSEXTEND = "native"

## Don't cache - always make it clean
BB_DONT_CACHE = "1"

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/pylint-fatal"
    install "${WORKDIR}/suppress" "${D}${datadir}/pylint-suppress"
}

FILES_${PN} = "${datadir}/**"