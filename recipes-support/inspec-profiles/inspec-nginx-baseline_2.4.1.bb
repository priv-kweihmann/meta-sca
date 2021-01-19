SUMMARY = "This Compliance Profile ensures that all hardening quality"
HOMEPAGE = "https://github.com/dev-sec/nginx-baseline"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "git://github.com/dev-sec/nginx-baseline.git;protocol=https"
SRCREV = "bd1a6765e16b338f48d4926bf864accdeec792ea"
S = "${WORKDIR}/git"

ROLE_NAME = "nginx-baseline"

do_configure() {
    :
}

do_compile() {
    :
}

do_install () {
    install -d ${D}/${datadir}/inspec/profiles/${ROLE_NAME}
    cp -r ${S}/* ${D}/${datadir}/inspec/profiles/${ROLE_NAME}
    rm -rf ${D}/${datadir}/inspec/profiles/${ROLE_NAME}/.git
    chown root:root ${D}/${datadir}/inspec/profiles/${ROLE_NAME}
}

FILES_${PN} += "${datadir}"

RDEPENDS_${PN} += "ruby-inspec-bin"
