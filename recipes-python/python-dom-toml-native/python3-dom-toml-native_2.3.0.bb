SUMMARY = "Dom's tools for Tom's Obvious, Minimal Language."
HOMEPAGE = "https://github.com/domdfcoding/dom_toml"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a484934fb535cddc2470eef202da5a2"

DEPENDS += "\
    python3-domdf-python-tools-native \
    python3-tomli-native \
"

SRC_URI[sha256sum] = "04d1138a7588119ec37ffe59e6474739a7ce7fcfcdf76555a064878ad82e3ae0"

inherit pypi
inherit pypi-old
inherit python_flit_core
inherit_defer native

PYPI_PACKAGE = "dom-toml"
