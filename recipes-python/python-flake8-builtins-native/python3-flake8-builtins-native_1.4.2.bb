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

SRC_URI[md5sum] = "f1b55546dcb9be98a14ab8183f570098"
SRC_URI[sha256sum] = "c44415fb19162ef3737056e700d5b99d48c3612a533943b4e16419a5d3de3a64"
