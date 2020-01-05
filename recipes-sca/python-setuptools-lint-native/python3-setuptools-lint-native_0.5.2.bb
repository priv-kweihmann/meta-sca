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
SRC_URI += "file://setuptoolslint.sca.description"

inherit native
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/setuptoolslint.sca.description ${D}${datadir}
}

SRC_URI[md5sum] = "308ec2510fc2845407057e91eb366aff"
SRC_URI[sha256sum] = "cc54107e5d10f77db8db06b0247880b7662f0f6e1a1df9c5af6bf54b50e829a9"
