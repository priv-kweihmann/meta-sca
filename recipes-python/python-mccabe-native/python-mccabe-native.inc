SUMMARY = "McCabe complexity checker for Python"
DESCRIPTION = "McCabe complexity checker for Python"
HOMEPAGE = "https://github.com/pycqa/mccabe"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a489dc62bacbdad3335c0f160a974f0f"

PYPI_PACKAGE = "mccabe"

DEPENDS += "${PYTHON_PN}-pytest-runner-native"

inherit pypi
inherit native
