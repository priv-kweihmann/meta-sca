SUMMARY = "Checks for old string formatting."

HOMEPAGE = "https://github.com/gforcada/flake8-pep3101"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PYPI_PACKAGE = "flake8-pep3101"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "ad92ef5c7916de5cf544bcf7caf8ca07"
SRC_URI[sha256sum] = "493821d6bdd083794eb0691ebe5b68e5c520b622b269d60e54308fb97440e21a"
