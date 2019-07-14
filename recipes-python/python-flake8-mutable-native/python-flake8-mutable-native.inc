SUMMARY = "flake8 extension for mutable default arguments"
DESCRIPTION = "flake8 extension for mutable default arguments"
HOMEPAGE = "https://github.com/ebeweber/flake8-mutable"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d524be351dfcd0878798ce25ede527ce"

PYPI_PACKAGE = "flake8-mutable"

DEPENDS += " \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-mccabe-native \
            ${PYTHON_PN}-pep8-native \
            ${PYTHON_PN}-pyflakes-native \
            "

inherit pypi
inherit native
