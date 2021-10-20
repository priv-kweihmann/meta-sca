SUMMARY = "All-round base protection ansible role"
DESCRIPTION = "This Ansible role provides numerous security-related configurations, providing all-round base protection"
HOMEPAGE = "https://github.com/dev-sec/ansible-os-hardening"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=94;md5=ddb48136ccd9c83e3549f5220a5a1caa"

SRC_URI = "git://github.com/dev-sec/ansible-os-hardening.git;protocol=https \
           file://${ROLE_NAME}.json"
SRCREV = "e819f89ccbe6f0ddc603c91c6b706ab468c5e121"
S = "${WORKDIR}/git"

ROLE_NAME = "dev-sec.os-hardening"

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
