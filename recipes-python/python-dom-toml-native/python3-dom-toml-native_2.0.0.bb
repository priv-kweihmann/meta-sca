SUMMARY = "Dom's tools for Tom's Obvious, Minimal Language."
HOMEPAGE = "https://github.com/domdfcoding/dom_toml"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a484934fb535cddc2470eef202da5a2"

DEPENDS += "\
    python3-domdf-python-tools-native \
    python3-tomli-native \
"

SRC_URI[sha256sum] = "3c07e8436538994974127b1ae037661d1a779ac915c44fd06b3ab5fe140ff589"

inherit pypi
inherit python_flit_core
inherit_defer native

PYPI_PACKAGE = "dom_toml"
