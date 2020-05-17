SUMMARY = "The pattern matching swiss knife"
HOMEPAGE = "https://github.com/VirusTotal/yara"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=541962f9dacf27c928f57e3a7ba9e1f2"

DEPENDS += "\
            bison-native"

SRC_URI = "git://github.com/VirusTotal/yara.git;protocol=https \
           file://yara.sca.description \
           file://0001-remove-protobuf-requirement.patch"

SRCREV = "f4a5daab94d77f7ad4c404634976ddd4c7bd9da6"

S = "${WORKDIR}/git"

inherit autotools-brokensep
inherit native
inherit sca-description

do_install_append () {
    install -d ${D}/${datadir}
    install ${WORKDIR}/yara.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
