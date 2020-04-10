SUMMARY = "Some security fixes for Ubuntu machines, more info on Sansible"
HOMEPAGE = "https://github.com/sansible/security_hardening"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6072eb3ddfc3ff6ddfeb4502d7976794"

SRC_URI = "git://github.com/sansible/security_hardening.git;protocol=https;tag=v${PV} \
           file://${ROLE_NAME}.json"

S = "${WORKDIR}/git"

ROLE_NAME = "sansible.security_hardening"

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
