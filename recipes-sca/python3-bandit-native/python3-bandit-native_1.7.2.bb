SUMMARY = "Bandit is a tool designed to find common security issues in Python code"
HOMEPAGE = "https://github.com/PyCQA/bandit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

DEPENDS += "\
            python3-gitpython-native \
            python3-native \
            python3-pyyaml-native \
            python3-six-native \
            python3-stevedore-native \
           "

SRC_URI[md5sum] = "714be866d8189b5a2f84113e243a2892"
SRC_URI[sha256sum] = "6d11adea0214a43813887bfe71a377b5a9955e4c826c8ffd341b494e3ab25260"

PYPI_PACKAGE = "bandit"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "bandit"
