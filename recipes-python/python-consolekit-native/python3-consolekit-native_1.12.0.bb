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

SRC_URI[sha256sum] = "20ec8e8e5dab4ac5d2a306c15938034f1a23d54385367d1e976c2b271204d814"

inherit pypi
inherit python_flit_core
inherit_defer native

PYPI_PACKAGE = "consolekit"
