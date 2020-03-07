SUMMARY = "Check license settings"

SRC_URI = " file://licensecheck \
            file://licensecheck.sca.description"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://licensecheck;beginline=3;endline=27;md5=0f52bba3b062bd6fa2e0dd24594f028e"

S = "${WORKDIR}"

inherit native
inherit sca-sanity

DEPENDS += "\
            python3-native \
            python3-license-expression-native \
            github.com-boyter-lc-native \
            "

FILES_${PN} = "${bindir} ${datadir}"

do_configure() {
    :
}

do_compile() {
    :
}

do_install_append() {
    mkdir -p ${D}${datadir}
    install ${WORKDIR}/licensecheck.sca.description ${D}${datadir}/
    mkdir -p ${D}${bindir}
    install -m 0755 ${WORKDIR}/licensecheck ${D}${bindir}/licensecheck
    sed -i "s#/usr/bin/env python3#/usr/bin/nativepython3#g" ${D}${bindir}/licensecheck
}
