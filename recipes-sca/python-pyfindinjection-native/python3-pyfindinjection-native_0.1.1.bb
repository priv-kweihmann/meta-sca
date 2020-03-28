SUMMARY = "simple python ast consumer which searches for common SQL injection attacks"
DESCRIPTION = "simple python ast consumer which searches for common SQL injection attacks"
HOMEPAGE = "https://github.com/uber/py-find-injection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1d25d70fea8b21087517ef9490406cb9"

SRC_URI = "git://github.com/priv-kweihmann/py-find-injection.git;protocol=https"
SRCREV = "31a0b2e45efe228a780e02c249637871c9e17777"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

DEPENDS += "${PYTHON_PN}-native"

FILES_${PN} += "${datadir}"
SRC_URI += "file://pyfindinjection.sca.description"

inherit native
inherit sca-sanity
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pyfindinjection.sca.description ${D}${datadir}
}
