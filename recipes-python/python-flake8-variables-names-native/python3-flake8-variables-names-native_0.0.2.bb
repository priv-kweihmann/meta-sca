SUMMARY = "A flake8 extension that helps to make more readable variables names"
HOMEPAGE = "https://github.com/best-doctor/flake8-variables-names"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=352fd8fef192c98968c70971a80f959c"

SRC_URI += "git://github.com/best-doctor/flake8-variables-names.git;protocol=https;tag=v${PV}"

PYPI_PACKAGE = "flake8_variables_names"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "aa03fb6add112159d23df345245acac7"
SRC_URI[sha256sum] = "f9ee2edf0892a73fff33ef3eda37a7182cb91cd4c3a19a592ad432b68b261927"
