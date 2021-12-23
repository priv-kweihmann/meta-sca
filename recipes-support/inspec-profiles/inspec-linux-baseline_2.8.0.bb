SUMMARY = "This Compliance Profile ensures that all hardening quality"
HOMEPAGE = "https://github.com/dev-sec/linux-baseline"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "git://github.com/dev-sec/linux-baseline.git;branch=master;protocol=https"
SRCREV = "2735730e7f063878beecce987a35d2c0a29421fd"
S = "${WORKDIR}/git"

ROLE_NAME = "linux-baseline"

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

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} += "rubygems-inspec-bin"
