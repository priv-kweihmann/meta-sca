SUMMARY = "The pattern matching swiss knife"
HOMEPAGE = "https://github.com/VirusTotal/yara"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=541962f9dacf27c928f57e3a7ba9e1f2"

DEPENDS += "\
            bison-native"

SRC_URI = "git://github.com/VirusTotal/yara.git;protocol=https \
           file://yara.sca.description \
           file://0001-remove-protobuf-requirement.patch \
           "

SRCREV = "e1360f6cbe3d8daf350018661bc6772bd5b726f2"

S = "${WORKDIR}/git"

inherit autotools-brokensep
inherit sca-description
inherit native

EXTRA_OECONF += "--disable-static"

do_install_append () {
    install -d ${D}/${datadir}
    install ${WORKDIR}/yara.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
