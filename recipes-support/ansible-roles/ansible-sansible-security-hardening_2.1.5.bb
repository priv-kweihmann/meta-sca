SUMMARY = "Some security fixes for Ubuntu machines, more info on Sansible"
HOMEPAGE = "https://github.com/sansible/security_hardening"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6072eb3ddfc3ff6ddfeb4502d7976794"

SRC_URI = "git://github.com/sansible/security_hardening.git;protocol=https \
           file://${ROLE_NAME}.json"
SRCREV = "4f3c56609181c575603f25b18f29e7375bbd6f7c"
S = "${WORKDIR}/git"

ROLE_NAME = "sansible.security_hardening"

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

do_install_append() {
    install -d ${D}/${datadir}/ansible/roles/
    install -m 0444 ${WORKDIR}/${ROLE_NAME}.json ${D}/${datadir}/ansible/roles/${ROLE_NAME}.json
    nativepython3 ${STAGING_BINDIR_NATIVE}/ansible-role-merger ${D}/${datadir}/ansible/roles/${ROLE_NAME}.json > \
        ${D}/${datadir}/ansible/rolebook-${ROLE_NAME}.yaml
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
