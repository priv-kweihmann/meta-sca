SUMMARY = "a version of dict that keeps keys in insertion resp. sorted order"
DESCRIPTION = "a version of dict that keeps keys in insertion resp. sorted order"
HOMEPAGE = "https://bitbucket.org/ruamel/ordereddict/src/default/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "ruamel.ordereddict"

DEPENDS += "${PYTHON_PN}-native"

inherit pypi

do_install_prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

inherit native
