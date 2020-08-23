SUMMARY = "Pylint is a tool that checks for errors in Python code"
HOMEPAGE = "https://github.com/PyCQA/pylint"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=c107cf754550e65755c42985a5d4e9c9"

DEPENDS += "\
            ${PYTHON_PN}-astroids-native \
            ${PYTHON_PN}-isort-native \
            ${PYTHON_PN}-mccabe-native \
            ${PYTHON_PN}-native \
            ${PYTHON_PN}-pytest-runner-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-toml-native \
            "

SRC_URI_append = " file://pylint.sca.description"
SRC_URI[md5sum] = "7db013001ada7c2a4383818cbc593326"
SRC_URI[sha256sum] = "bb4a908c9dadbc3aac18860550e870f58e1a02c9f2c204fdf5693d73be061210"

PYPI_PACKAGE = "pylint"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pylint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"

## A python file with /usr/bin/python-shebang is
## used - ignore this error
INSANE_SKIP_${PN} += "file-rdeps"
