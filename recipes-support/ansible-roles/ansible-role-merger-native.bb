SUMMARY = "Merge ansible roles"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "python3-pyyaml-native"

SRC_URI = "file://ansible-role-merger"

inherit python3native
inherit native

do_install() {
    install -d ${D}/${bindir}
    sed -i "s#/usr/bin/env python3#/usr/bin/env nativepython3#g" ${WORKDIR}/ansible-role-merger
    install -m 0755 ${WORKDIR}/ansible-role-merger ${D}/${bindir}
}

FILES_${PN} = "${bindir}"
