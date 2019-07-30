SUMMARY = "a version of dict that keeps keys in insertion resp. sorted order"
DESCRIPTION = "a version of dict that keeps keys in insertion resp. sorted order"
HOMEPAGE = "https://bitbucket.org/ruamel/ordereddict/src/default/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=597d7ca5f4c6d10fb0278534453100c0"

PYPI_PACKAGE = "ruamel.ordereddict"

DEPENDS += "${PYTHON_PN}-native"

inherit pypi

do_install_prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

inherit native
