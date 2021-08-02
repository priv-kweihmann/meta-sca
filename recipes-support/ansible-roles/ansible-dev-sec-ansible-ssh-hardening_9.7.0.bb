SUMMARY = "All-round base SSH protection ansible role"
DESCRIPTION = "This Ansible role provides numerous security-related ssh configurations, providing all-round base protection"
HOMEPAGE = "https://github.com/dev-sec/ansible-ssh-hardening"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=212;md5=b156ab02bcca4cc0b1ad712e991868da"

SRC_URI = "git://github.com/dev-sec/ansible-ssh-hardening.git;protocol=https \
           file://${ROLE_NAME}.json"
SRCREV = "aaece07fe0cc862b137bf70980a5d912fe3195a4"
S = "${WORKDIR}/git"

ROLE_NAME = "dev-sec.ssh-hardening"

DEPENDS += "ansible-role-merger-native"

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

do_install:append() {
    install -d ${D}/${datadir}/ansible/roles/
    install -m 0444 ${WORKDIR}/${ROLE_NAME}.json ${D}/${datadir}/ansible/roles/${ROLE_NAME}.json
    nativepython3 ${STAGING_BINDIR_NATIVE}/ansible-role-merger ${D}/${datadir}/ansible/roles/${ROLE_NAME}.json > \
        ${D}/${datadir}/ansible/rolebook-${ROLE_NAME}.yaml
}

FILES:${PN} += "${datadir}"

RDEPENDS:${PN}:class-target += "\
                                perl \
                                python3-ansible \
                               "
RDEPENDS:${PN}:class-native += "\
                                perl-native \
                                python3-ansible-native \
                               "

BBCLASSEXTEND = "native"
