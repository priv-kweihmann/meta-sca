SUMMARY = "This Ansible role provides secure nginx configurations"
HOMEPAGE = "https://github.com/dev-sec/ansible-nginx-hardening"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://README.md;beginline=99;endline=111;md5=2ab3162740f7774a896bebbaef1707ff"

SRC_URI = "git://github.com/dev-sec/ansible-nginx-hardening.git;protocol=https;tag=${PV}"

S = "${WORKDIR}/git"

ROLE_NAME = "dev-sec.nginx-hardening"

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
