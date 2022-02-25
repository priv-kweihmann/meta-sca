SUMMARY = "Python type inferencer"
HOMEPAGE = "https://google.github.io/pytype/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a2cfaba162d74b289e2cac209dfa88"

DEPENDS += "\
            cmake-native \
            python3-attrs-native \
            python3-importlab-native \
            python3-libcst-native \
            python3-ninja-native \
            python3-pybind11-native \
            python3-pylint-native \
            python3-pyyaml-native \
            python3-scikit-build-native \
            python3-six-native \
            python3-tabulate-native \
            python3-typed-ast-native \
            "

SRC_URI[md5sum] = "8944ce81aec88ed168331853f99875e4"
SRC_URI[sha256sum] = "3e3a97053e7d8c5c7cbb24469ce9c12f87de7aa04684dbf9338ccac8bfa3fa08"

PYPI_PACKAGE = "pytype"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "pytype"

do_configure:prepend() {
    sed -i "/ninja/d" ${S}/setup.cfg
}
