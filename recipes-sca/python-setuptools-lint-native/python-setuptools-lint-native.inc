SUMMARY = "expose pylint as a lint command into setup.py"
HOMEPAGE = "https://github.com/johnnoone/setuptools-pylint"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=2;endline=9;md5=8f858f728d20adf75688b6373529ae78"

DEPENDS += " \
            ${PYTHON_PN}-pylint-native \
            "

PYPI_PACKAGE = "setuptools-lint"

inherit pypi
inherit sca-sanity

FILES_${PN} += "${datadir}"
SRC_URI += "file://setuptoolslint.sca.description \
            file://setuptoolslint.sca.score"

inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/setuptoolslint.sca.description ${D}${datadir}
    install ${WORKDIR}/setuptoolslint.sca.score ${D}${datadir}
}