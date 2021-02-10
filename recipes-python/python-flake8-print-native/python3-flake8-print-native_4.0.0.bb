SUMMARY = "print statement checker plugin for flake8"
HOMEPAGE = "https://github.com/jbkahn/flake8-print"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "\
            python3-flake8-native \
            python3-pycodestyle-native \
            python3-six-native \
            "

PYPI_PACKAGE = "flake8-print"

SRC_URI[md5sum] = "424516fa984b8432cda5faf01b53cc6a"
SRC_URI[sha256sum] = "5afac374b7dc49aac2c36d04b5eb1d746d72e6f5df75a6ecaecd99e9f79c6516"

inherit pypi
inherit setuptools3
inherit native
