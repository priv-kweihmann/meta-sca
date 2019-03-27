SUMMARY = "a small build system with a focus on speed"
DESCRIPTION = "a small build system with a focus on speed"
HOMEPAGE = "https://github.com/ninja-build/ninja"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE_Apache_20;md5=8534cc5f25cb0717c5af1b301fba20c8"

PYPI_PACKAGE = "ninja"

DEPENDS += "${PYTHON_PN}-scikit-build-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-wheel-native \
            cmake-native"

inherit pypi

FILES_${PN} += "${datadir}/ninja"

inherit native
