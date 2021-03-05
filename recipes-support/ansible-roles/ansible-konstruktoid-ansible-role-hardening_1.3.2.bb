SUMMARY = "Ansible role to apply a security baseline. Systemd edition."
HOMEPAGE = "https://github.com/konstruktoid/ansible-role-hardening"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://LICENSE;md5=0a69df9dc95cd69be37c3c6b9a06cfa0"

SRC_URI = "git://github.com/konstruktoid/ansible-role-hardening.git;protocol=https \
           file://${ROLE_NAME}.json"
SRCREV = "bfc16a0ca02d76c4b6751cb1119c58bbb9beed5b"

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

do_install_append() {
    install -d ${D}/${datadir}/ansible/roles/
    install -m 0444 ${WORKDIR}/${ROLE_NAME}.json ${D}/${datadir}/ansible/roles/${ROLE_NAME}.json
}

FILES_${PN} += "${datadir}"

RDEPENDS_${PN}_class-target += "\
                                perl \
                                python3-ansible \
                               "
RDEPENDS_${PN}_class-native += "\
                                perl-native \
                                python3-ansible-native \
                               "

BBCLASSEXTEND = "native"
