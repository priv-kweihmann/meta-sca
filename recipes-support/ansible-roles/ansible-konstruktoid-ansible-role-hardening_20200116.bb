SUMMARY = "Ansible role to apply a security baseline. Systemd edition."
HOMEPAGE = "https://github.com/konstruktoid/ansible-role-hardening"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://LICENSE;md5=0a69df9dc95cd69be37c3c6b9a06cfa0"

SRC_URI = "git://github.com/konstruktoid/ansible-role-hardening.git;protocol=https"
SRCREV = "6080477b066495e6b78c7f32639baac8a9edd277"

S = "${WORKDIR}/git"

ROLE_NAME = "konstruktoid-ansible-role-hardening"

do_configure() {
    :
}

do_compile() {
    :
}

do_install () {
	install -d ${D}/${datadir}/ansible-roles/${ROLE_NAME}
    cp -r ${S} ${D}/${datadir}/ansible-roles/${ROLE_NAME}
    rm -rf ${D}/${datadir}/ansible-roles/${ROLE_NAME}/.git
    chown root:root ${D}/${datadir}/ansible-roles/${ROLE_NAME}
}

SRC_URI += "file://ansible-${ROLE_NAME}.json"
do_install_append() {
    install -d ${D}/${datadir}/ansible-roles/
    install -m 0444 ${WORKDIR}/ansible-${ROLE_NAME}.json ${D}/${datadir}/ansible-roles/ansible-${ROLE_NAME}.json
}

RDEPENDS_${PN}_class-target += "python3-ansible perl"
RDEPENDS_${PN}_class-native += "python3-ansible-native perl-native"

FILES_${PN} += "${datadir}"

BBCLASSEXTEND = "native"