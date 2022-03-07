SUMMARY = "flake8 plugin for validation of function parameters (length, complexity, etc)"
HOMEPAGE = "https://github.com/best-doctor/flake8-functions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=352fd8fef192c98968c70971a80f959c"

DEPENDS += "\
            python3-flake8-native \
            python3-mr-proper-native \
            python3-setuptools-native \
            "

PYPI_PACKAGE = "flake8_functions"

SRC_URI[sha256sum] = "40584b05d57e5ab185545bcfa08aa0edca52b04646d0df266e2b1667d6437184"

inherit pypi
inherit native
