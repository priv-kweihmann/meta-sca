SUMMARY = "Ansible role to apply a security baseline. Systemd edition."
HOMEPAGE = "https://github.com/konstruktoid/ansible-role-hardening"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://LICENSE;md5=0a69df9dc95cd69be37c3c6b9a06cfa0"

SRC_URI = "git://github.com/konstruktoid/ansible-role-hardening.git;branch=master;protocol=https \
           file://${ROLE_NAME}.json"
SRCREV = "6cdb42f2ebc5300e649f951603e82b856a5b0481"

S = "${WORKDIR}/git"

ROLE_NAME = "konstruktoid.hardening"

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
