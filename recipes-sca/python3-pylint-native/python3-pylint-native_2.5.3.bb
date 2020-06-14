SUMMARY = "Pylint is a tool that checks for errors in Python code"
HOMEPAGE = "https://github.com/PyCQA/pylint"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4325afd396febcb659c36b49533135d4"

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
SRC_URI[md5sum] = "5e4d0c2b5355424c2716ee8e20f7db43"
SRC_URI[sha256sum] = "7dd78437f2d8d019717dbf287772d0b2dbdfd13fc016aa7faa08d67bccc46adc"

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
