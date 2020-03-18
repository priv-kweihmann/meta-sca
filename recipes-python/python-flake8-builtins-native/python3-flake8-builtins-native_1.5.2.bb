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

SRC_URI[md5sum] = "22ade09660c287e87971b20cd1a4f8d3"
SRC_URI[sha256sum] = "fe7be13fe51bfb06bdae6096c6488e328c822c3aa080e24b91b77116a4fbb8b0"
