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

SRC_URI[sha256sum] = "dea6b9f250369eab8823df56f921844071e56f5051ac059d8a150e890626727b"

inherit pypi
inherit python_flit_core
inherit_defer native

PYPI_PACKAGE = "consolekit"
