SUMMARY = "Pylint is a tool that checks for errors in Python code"
HOMEPAGE = "https://github.com/PyCQA/pylint"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4325afd396febcb659c36b49533135d4"

DEPENDS += " \
            ${PYTHON_PN}-astroids-native \
            ${PYTHON_PN}-isort-native \
            ${PYTHON_PN}-mccabe-native \
            ${PYTHON_PN}-native \
            ${PYTHON_PN}-pytest-runner-native \
            ${PYTHON_PN}-six-native \
            "

## A python file with /usr/bin/python-shebang is 
## used - ignore this error
INSANE_SKIP_${PN} += "file-rdeps"

PYPI_PACKAGE = "pylint"

inherit pypi
inherit sca-sanity
inherit setuptools3

FILES_${PN} += "${datadir}"
SRC_URI += "file://pylint.sca.description"

inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pylint.sca.description ${D}${datadir}
}

SRC_URI[md5sum] = "37b39717a69ab48fbe29aacc3bb3047c"
SRC_URI[sha256sum] = "723e3db49555abaf9bf79dc474c6b9e2935ad82230b10c1138a71ea41ac0fff1"
