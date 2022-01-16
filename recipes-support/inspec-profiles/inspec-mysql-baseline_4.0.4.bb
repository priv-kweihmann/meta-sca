SUMMARY = "This Compliance Profile ensures that all hardening quality"
HOMEPAGE = "https://github.com/dev-sec/mysql-baseline"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=25;md5=a894c5eb0fa294b12a9446703fd94440"

SRC_URI = "git://github.com/dev-sec/mysql-baseline.git;branch=master;protocol=https"
SRCREV = "e395a0a50e18c07b55d6a4e6212235ca2f6b1e25"
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
