SUMMARY = "Ansible role to apply a security baseline. Systemd edition."
HOMEPAGE = "https://github.com/konstruktoid/ansible-role-hardening"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://LICENSE;md5=0a69df9dc95cd69be37c3c6b9a06cfa0"

SRC_URI = "git://github.com/konstruktoid/ansible-role-hardening.git;protocol=https"
SRCREV = "19cd4a8821289f009b652eb6062d81c309c0d0d3"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

ROLE_NAME = "konstruktoid.hardening"

do_configure() {
    :
}

do_compile() {
    :
}

do_install () {
    install -d ${D}/${datadir}/ansible/roles/${ROLE_NAME}
    cp -r ${S}/* ${D}/${datadir}/ansible/roles/${ROLE_NAME}
    rm -rf ${D}/${datadir}/ansible/roles/${ROLE_NAME}/.git
    chown root:root ${D}/${datadir}/ansible/roles/${ROLE_NAME}
}

SRC_URI += "file://${ROLE_NAME}.json"
do_install_append() {
    install -d ${D}/${datadir}/ansible/roles/
    install -m 0444 ${WORKDIR}/${ROLE_NAME}.json ${D}/${datadir}/ansible/roles/${ROLE_NAME}.json
}

RDEPENDS_${PN}_class-target += "python3-ansible perl"
RDEPENDS_${PN}_class-native += "python3-ansible-native perl-native"

FILES_${PN} += "${datadir}"

BBCLASSEXTEND = "native"
