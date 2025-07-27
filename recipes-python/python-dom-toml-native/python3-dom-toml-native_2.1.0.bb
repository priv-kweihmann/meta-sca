SUMMARY = "Dom's tools for Tom's Obvious, Minimal Language."
HOMEPAGE = "https://github.com/domdfcoding/dom_toml"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a484934fb535cddc2470eef202da5a2"

DEPENDS += "\
    python3-domdf-python-tools-native \
    python3-tomli-native \
"

SRC_URI[sha256sum] = "5cc0dd10ce2566d35bc1d94a6ef16c062971ff0318c6f3705800d61d2075adac"

inherit pypi
inherit pypi-old
inherit python_flit_core
inherit_defer native

PYPI_PACKAGE = "dom-toml"
