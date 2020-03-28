SUMMARY = "This Ansible role provides security configuration for MySQL"
HOMEPAGE = "https://github.com/dev-sec/ansible-mysql-hardening"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://README.md;beginline=102;endline=116;md5=b0fb70f60608f0cc14daa7d3f72aed35"

SRC_URI = "git://github.com/dev-sec/ansible-mysql-hardening.git;protocol=https;tag=${PV}"

S = "${WORKDIR}/git"

ROLE_NAME = "dev-sec.mysql-hardening"

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
