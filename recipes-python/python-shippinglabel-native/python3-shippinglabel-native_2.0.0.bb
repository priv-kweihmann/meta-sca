SUMMARY = "Utilities for handling packages."
HOMEPAGE = "https://github.com/domdfcoding/shippinglabel"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c61fe6187288c5c2e41810d0457f1e89"

SRC_URI[sha256sum] = "85962c2be217fdae1b64cb43fa13046039f082a85d924107906d0c3e4020cb6d"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

do_configure:prepend() {
    sed -i 's#"setuptools!=.*"#"setuptools"#g' ${S}/pyproject.toml
}

PYPI_PACKAGE = "shippinglabel"
