SUMMARY = "The pattern matching swiss knife"
HOMEPAGE = "https://github.com/VirusTotal/yara"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=541962f9dacf27c928f57e3a7ba9e1f2"

DEPENDS += "\
            bison-native"

SRC_URI = "git://github.com/VirusTotal/yara.git;protocol=https;branch=4.1.x \
           file://yara.sca.description \
           file://0001-remove-protobuf-requirement.patch \
           "

SRCREV = "b99a808cf9955090b909c72d6a0da5295c3cbc7c"

S = "${WORKDIR}/git"

inherit autotools-brokensep
inherit sca-description
inherit native

EXTRA_OECONF += "--disable-static"

do_install:append () {
    install -d ${D}/${datadir}
    install ${WORKDIR}/yara.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"
