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

SRC_URI[md5sum] = "8b6ac2762371b341655a11e2a681dc7e"
SRC_URI[sha256sum] = "4237100af865681cdc6c107c30885bb31e1c472ed791dbd47261bbacce3c4a8b"

inherit pypi
inherit setuptools3
inherit native
