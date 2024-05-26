SUMMARY = "Enhanced package qa"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://pkgqaenc.py;beginline=3;endline=27;md5=0f52bba3b062bd6fa2e0dd24594f028e"

DEPENDS += "python3-native python3-python-magic-native"

SRC_URI = "file://pkgqaenc.py"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}"

inherit sca-description
inherit_defer native

SCA_TOOL_DESCRIPTION = "pkgqaenc"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install:append() {
    install -d ${D}${bindir}
    install -m 0755 ${UNPACKDIR}/pkgqaenc.py ${D}${bindir}/pkgqaenc
}

FILES:${PN} += "${bindir}"
