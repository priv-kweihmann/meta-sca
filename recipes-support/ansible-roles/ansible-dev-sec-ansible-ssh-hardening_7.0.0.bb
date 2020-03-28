SUMMARY = "This Ansible role provides numerous security-related ssh configurations, providing all-round base protection"
HOMEPAGE = "https://github.com/dev-sec/ansible-ssh-hardening"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://README.md;beginline=201;endline=215;md5=9ef02fc7042855790be12396a3fe645b"

SRC_URI = "git://github.com/dev-sec/ansible-ssh-hardening.git;protocol=https;tag=${PV}"

S = "${WORKDIR}/git"

ROLE_NAME = "dev-sec.ssh-hardening"

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
