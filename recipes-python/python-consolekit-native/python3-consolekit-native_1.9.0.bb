SUMMARY = "Additional utilities for click."
HOMEPAGE = "https://github.com/domdfcoding/consolekit"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d60877ca6cdf71706616f32e1e177f40"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
DEPENDS += "\
    python3-click-native \
    python3-colorama-native \
    python3-deprecation-alias-native \
    python3-domdf-python-tools-native \
    python3-mistletoe-native \
    python3-typing-extensions-native \
"

SRC_URI[sha256sum] = "81e3c514eaba8d0174400d2096cd7e72374d311bad65f3363a0ebf1693f4c374"

inherit pypi
inherit python_flit_core
inherit_defer native

PYPI_PACKAGE = "consolekit"
