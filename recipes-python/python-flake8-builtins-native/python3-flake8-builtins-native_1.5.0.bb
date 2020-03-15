SUMMARY = "Check for python builtins being used as variables or parameters"
DESCRIPTION = "Check for python builtins being used as variables or parameters"
HOMEPAGE = "https://github.com/gforcada/flake8-builtins"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PYPI_PACKAGE = "flake8-builtins"

DEPENDS += " \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-mccabe-native \
            ${PYTHON_PN}-pycodestyle-native \
            ${PYTHON_PN}-pyflakes-native \
            "

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "f7e35417d6cc48fcb420aff69ebdf39d"
SRC_URI[sha256sum] = "5de3917b9b6d81e8b92d56ebc2873cc178978658848a7a16a638a6ea5842f70c"
