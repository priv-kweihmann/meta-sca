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

SRC_URI[md5sum] = "80ba00f46bbfe6ce6934b1433c1e7e85"
SRC_URI[sha256sum] = "d017dd1d09ff2a072de194f7e0a84c80c0b79d2d2e9c4de22fb0e25838570d29"

inherit pypi
inherit setuptools3
inherit native
