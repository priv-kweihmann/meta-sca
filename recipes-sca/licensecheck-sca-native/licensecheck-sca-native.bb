SUMMARY = "Check license settings"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://licensecheck;beginline=3;endline=27;md5=0f52bba3b062bd6fa2e0dd24594f028e"

DEPENDS += "\
            github.com-boyter-lc-native \
            python3-license-expression-native \
            python3-native \
            "

SRC_URI = "file://licensecheck \
           file://licensecheck.sca.description"

S = "${WORKDIR}"

inherit native
inherit sca-sanity
inherit sca-description

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/licensecheck.sca.description ${D}${datadir}/
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/licensecheck ${D}${bindir}/licensecheck
    sed -i "s#/usr/bin/env python3#/usr/bin/nativepython3#g" ${D}${bindir}/licensecheck
}

FILES_${PN} = "${bindir} ${datadir}"
