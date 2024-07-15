SUMMARY = "Parser for 'pyproject.toml'"
HOMEPAGE = "https://github.com/repo-helper/pyproject-parser"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a484934fb535cddc2470eef202da5a2"

DEPENDS += "\
    python3-apeye-core-native \
    python3-attrs-native \
    python3-dom-toml-native \
    python3-domdf-python-tools-native \
    python3-natsort-native \
    python3-packaging-native \
    python3-shippinglabel-native \
    python3-typing-extensions-native \
"

SRC_URI[sha256sum] = "d1e8edbba3a5480eb0ff3ffe8f6943ba2905199878aff1cb05984900a6618201"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

do_configure:prepend() {
    sed -i 's#"setuptools!=.*"#"setuptools"#g' ${S}/pyproject.toml
}

PYPI_PACKAGE = "pyproject-parser"
