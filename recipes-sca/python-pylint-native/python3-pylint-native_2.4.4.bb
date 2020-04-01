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
            "

SRC_URI += "file://pylint.sca.description"
SRC_URI[md5sum] = "6c1fd3345b63bd0160612882381579a7"
SRC_URI[sha256sum] = "3db5468ad013380e987410a8d6956226963aed94ecb5f9d3a28acca6d9ac36cd"

PYPI_PACKAGE = "pylint"

inherit pypi
inherit sca-sanity
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
