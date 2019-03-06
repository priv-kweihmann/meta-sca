SUMMARY = "pylint"
DESCRIPTION = "Static code analyser for python files"
HOMEPAGE = "https://github.com/PyCQA/pylint"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4325afd396febcb659c36b49533135d4"

DEPENDS += "${PYTHON_PN}-native \
            ${PYTHON_PN}-isort-native \
            ${PYTHON_PN}-astroids-native \
            ${PYTHON_PN}-pytest-runner-native"

## A python file with /usr/bin/python-shebang is 
## used - ignore this error
INSANE_SKIP_${PN} += "file-rdeps"

PYPI_PACKAGE = "pylint"

inherit pypi

FILES_${PN} += "${datadir}/pylint"

inherit native
