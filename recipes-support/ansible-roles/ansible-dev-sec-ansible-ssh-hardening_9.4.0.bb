SUMMARY = "All-round base SSH protection ansible role"
DESCRIPTION = "This Ansible role provides numerous security-related ssh configurations, providing all-round base protection"
HOMEPAGE = "https://github.com/dev-sec/ansible-ssh-hardening"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=203;md5=c8d04a546b88fc61b347e6107ea60521"

SRC_URI = "git://github.com/dev-sec/ansible-ssh-hardening.git;protocol=https \
           file://${ROLE_NAME}.json"
SRCREV = "0cbfc29f23a6c801e9b1aa0db78179b3b047f8de"
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
