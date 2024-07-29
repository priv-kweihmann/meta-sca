SUMMARY = "plugincode is a library that provides plugin functionality for ScanCode toolkit"
HOMEPAGE = "https://github.com/nexB/plugincode"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "\
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "plugincode"

SRC_URI[md5sum] = "647da988be37e1e60e20833340170cc7"
SRC_URI[sha256sum] = "4132d93b1755271c6e226c9da2e2044ff62ebcb873b5e958d66a8ddde9f345fa"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
