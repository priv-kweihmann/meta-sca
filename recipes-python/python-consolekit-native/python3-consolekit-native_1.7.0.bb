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

SRC_URI[sha256sum] = "0ea8bce2a7941a2af0e33d5acb76eeacb78711278d2b60c33ed3e7a49cc3fd0c"

inherit pypi
inherit python_flit_core
inherit_defer native

# fix pending upstream bug
# nooelint: oelint.vars.dependsclass
DEPENDS:remove = "python3"

PYPI_PACKAGE = "consolekit"
