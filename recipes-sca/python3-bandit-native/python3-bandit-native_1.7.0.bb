SUMMARY = "Bandit is a tool designed to find common security issues in Python code"
HOMEPAGE = "https://github.com/PyCQA/bandit"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

DEPENDS += "\
            python3-gitpython-native \
            python3-native \
            python3-pyyaml-native \
            python3-six-native \
            python3-stevedore-native \
           "

SRC_URI_append = " file://bandit.sca.description"

SRC_URI[md5sum] = "24965f102dc62129d3fafe4fe596a3b8"
SRC_URI[sha256sum] = "8a4c7415254d75df8ff3c3b15cfe9042ecee628a1e40b44c15a98890fbfc2608"

PYPI_PACKAGE = "bandit"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/bandit.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
