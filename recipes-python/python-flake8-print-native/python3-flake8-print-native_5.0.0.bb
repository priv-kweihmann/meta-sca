SUMMARY = "print statement checker plugin for flake8"
HOMEPAGE = "https://github.com/jbkahn/flake8-print"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "\
            python3-flake8-native \
            python3-pycodestyle-native \
            python3-six-native \
            "

PYPI_PACKAGE = "flake8-print"

SRC_URI[md5sum] = "b541b0ca61010d3a6fa91a3fb1400a06"
SRC_URI[sha256sum] = "76915a2a389cc1c0879636c219eb909c38501d3a43cc8dae542081c9ba48bdf9"

inherit pypi
inherit setuptools3
inherit native
