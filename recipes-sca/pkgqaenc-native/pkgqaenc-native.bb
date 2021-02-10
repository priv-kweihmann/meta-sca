SUMMARY = "Enhanced package qa"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://pkgqaenc.py;beginline=3;endline=27;md5=0f52bba3b062bd6fa2e0dd24594f028e"

DEPENDS += "python3-native python3-python-magic-native"

SRC_URI = "file://pkgqaenc.py \
           file://pkgqaenc.sca.description"

S = "${WORKDIR}"

inherit sca-description
inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pkgqaenc.sca.description ${D}${datadir}/
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/pkgqaenc.py ${D}${bindir}/pkgqaenc
}

FILES_${PN} = "${bindir} ${datadir}"
