SUMMARY = "The pattern matching swiss knife"
HOMEPAGE = "https://github.com/VirusTotal/yara"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=541962f9dacf27c928f57e3a7ba9e1f2"

DEPENDS += "\
            bison-native"

SRC_URI = "git://github.com/VirusTotal/yara.git;protocol=https \
           file://yara.sca.description \
           file://0001-remove-protobuf-requirement.patch \
           file://0001-Makefile.am-remove-hardcoded-static-lib.patch \
           "

SRCREV = "1595e53ea67f091b30fd4fd7802410058f3e1a3f"

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
