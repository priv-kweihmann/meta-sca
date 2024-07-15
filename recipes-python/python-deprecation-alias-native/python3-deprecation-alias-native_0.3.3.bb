SUMMARY = "A wrapper around 'deprecation' providing support for deprecated aliases."
HOMEPAGE = "https://github.com/domdfcoding/deprecation-alias"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5649ee3559093f2fd471058ae867a8c"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
DEPENDS += "\
    python3-deprecation-native \
    python3-packaging-native \
"

SRC_URI[sha256sum] = "e73266d4c866c040079d7a047f92ac2cd468b4608032486df1ffd7ef147e6515"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

do_configure:prepend() {
    sed -i 's#"setuptools!=.*"#"setuptools"#g' ${S}/pyproject.toml
}

PYPI_PACKAGE = "deprecation-alias"
