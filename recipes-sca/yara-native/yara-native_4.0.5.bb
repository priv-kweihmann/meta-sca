SUMMARY = "The pattern matching swiss knife"
HOMEPAGE = "https://github.com/VirusTotal/yara"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=541962f9dacf27c928f57e3a7ba9e1f2"

DEPENDS += "\
            bison-native"

SRC_URI = "git://github.com/VirusTotal/yara.git;protocol=https;branch=4.0.x \
           file://yara.sca.description \
           file://0001-remove-protobuf-requirement.patch \
           file://0001-Makefile.am-remove-hardcoded-static-lib.patch \
           "

SRCREV = "7825004a5a7d1bd69802d85de775224994269a4b"

S = "${WORKDIR}/git"

inherit autotools-brokensep
inherit native
inherit sca-description

EXTRA_OECONF += "--disable-static"

do_install_append () {
    install -d ${D}/${datadir}
    install ${WORKDIR}/yara.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
