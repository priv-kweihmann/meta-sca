SUMMARY = "Bandit is a tool designed to find common security issues in Python code"
HOMEPAGE = "https://github.com/PyCQA/bandit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

DEPENDS += "\
            python3-gitpython-native \
            python3-native \
            python3-pyyaml-native \
            python3-six-native \
            python3-stevedore-native \
           "

SRC_URI[md5sum] = "d071febf76e2a85f540eddd113bcd6b0"
SRC_URI[sha256sum] = "a81b00b5436e6880fa8ad6799bc830e02032047713cbb143a12939ac67eb756c"

PYPI_PACKAGE = "bandit"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "bandit"
