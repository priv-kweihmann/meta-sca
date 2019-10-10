SUMMARY = "The pattern matching swiss knife"
HOMEPAGE = "https://github.com/VirusTotal/yara"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=541962f9dacf27c928f57e3a7ba9e1f2"

SRC_URI = "git://github.com/VirusTotal/yara.git;protocol=https;tag=v${PV} \
           file://yara.sca.description \
           file://yara.sca.score"
S = "${WORKDIR}/git"

inherit autotools-brokensep
inherit native

do_install_append () {
	install -d ${D}/${datadir}

    install ${WORKDIR}/yara.sca.description ${D}${datadir}
    install ${WORKDIR}/yara.sca.score ${D}${datadir}
}

FILES_${PN} += "${datadir}"

DEPENDS += "bison-native"
