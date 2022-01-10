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

SRC_URI[md5sum] = "9b9a606e2f6538f749bfffd24386f338"
SRC_URI[sha256sum] = "c824d09dd463165ee47dd78f7ca30941353c2095361aadb57165c4211c148901"

PYPI_PACKAGE = "pytype"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "pytype"

do_configure:prepend() {
    sed -i "/ninja/d" ${S}/setup.cfg
}
