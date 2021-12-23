SUMMARY = "This Compliance Profile ensures that all hardening quality"
HOMEPAGE = "https://github.com/dev-sec/mysql-baseline"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=25;md5=c82165669c804457a5124013cb24171c"

SRC_URI = "git://github.com/dev-sec/mysql-baseline.git;branch=master;protocol=https"
SRCREV = "fc8340813847d55ac60447f30ffd8b4ca767c187"
S = "${WORKDIR}/git"

ROLE_NAME = "mysql-baseline"

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
