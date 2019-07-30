SUMMARY = "simple python ast consumer which searches for common SQL injection attacks"
DESCRIPTION = "simple python ast consumer which searches for common SQL injection attacks"
HOMEPAGE = "https://github.com/uber/py-find-injection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1d25d70fea8b21087517ef9490406cb9"

SRC_URI = "git://github.com/uber/py-find-injection.git;protocol=https"
SRCREV = "f91c137e8b78424bec78085df771b1a6f62c6769"

S = "${WORKDIR}/git"

DEPENDS += "${PYTHON_PN}-native"

FILES_${PN} += "${datadir}"
SRC_URI += "file://pyfindinjection.sca.description \
            file://pyfindinjection.sca.score"

inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pyfindinjection.sca.description ${D}${datadir}
    install ${WORKDIR}/pyfindinjection.sca.score ${D}${datadir}
}