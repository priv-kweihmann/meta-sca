SUMMARY = "License check helper"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://licensecheck;beginline=3;endline=27;md5=0f52bba3b062bd6fa2e0dd24594f028e"

DEPENDS += "\
            python3-license-expression-native \
            python3-native \
            "

SRC_URI = "file://licensecheck"

S = "${WORKDIR}"

inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install:append() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/licensecheck ${D}${bindir}/licensecheck
}

FILES:${PN} = "${bindir}"
