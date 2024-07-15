SUMMARY = "A simple Python wheel builder for simple projects."
HOMEPAGE = "https://github.com/repo-helper/whey"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a484934fb535cddc2470eef202da5a2"

DEPENDS += "\
    python3-attrs-native \
    python3-click-native \
    python3-consolekit-native \
    python3-dist-meta-native \
    python3-dom-toml-native \
    python3-domdf-python-tools-native \
    python3-handy-archives-native \
    python3-natsort-native \
    python3-packaging-native \
    python3-pyproject-parser-native \
    python3-shippinglabel-native \
"

SRC_URI[sha256sum] = "97bd9f8dcceeb835e0fdc0e2a89eeba0d566e17f9abbed6ee0003c4b3b356cda"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

do_configure:prepend() {
    sed -i 's#"setuptools!=.*"#"setuptools"#g' ${S}/pyproject.toml
}

PYPI_PACKAGE = "whey"
