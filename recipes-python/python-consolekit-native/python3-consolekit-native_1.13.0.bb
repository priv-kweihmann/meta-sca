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

SRC_URI[sha256sum] = "6c28df284ec86fb395fbe39493ddf9f8dfc8b181a6156abfd50c3f2156ad2b20"

inherit pypi
inherit python_flit_core
inherit_defer native

PYPI_PACKAGE = "consolekit"
