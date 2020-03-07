SUMMARY = "Enhanced package qa"

SRC_URI = " file://pkgqaenc.py \
            file://pkgqaenc.sca.description"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://pkgqaenc.py;beginline=3;endline=27;md5=0f52bba3b062bd6fa2e0dd24594f028e"

S = "${WORKDIR}"

inherit native
inherit sca-sanity

DEPENDS += "python3-native python3-python-magic-native"
RDEPENDS_${PN} += "python3-native python3-python-magic-native"

FILES_${PN} = "${bindir} ${datadir}"

do_configure() {
    :
}

do_compile() {
    :
}

do_install_append() {
    mkdir -p ${D}${datadir}
    install ${WORKDIR}/pkgqaenc.sca.description ${D}${datadir}/
    mkdir -p ${D}${bindir}
    install -m 0755 ${WORKDIR}/pkgqaenc.py ${D}${bindir}/pkgqaenc
}
