SUMMARY = "Bandit is a tool designed to find common security issues in Python code."
DESCRIPTION = "Bandit is a tool designed to find common security issues in Python code."
HOMEPAGE = "https://github.com/PyCQA/bandit"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PV = "1.5.1"

SRC_URI[md5sum] = "81ba3979ded1b421fa8d69e6faa06dcb"
SRC_URI[sha256sum] = "9413facfe9de1e1bd291d525c784e1beb1a55c9916b51dae12979af63a69ba4c"

DEPENDS += "python3-native stevedore-native gitpython-native python3-six-native pyyaml-native"

PYPI_PACKAGE = "bandit"

inherit native
inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/bandit"
