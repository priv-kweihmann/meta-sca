SUMMARY = "Helpful functions for Python"
HOMEPAGE = "https://github.com/domdfcoding/domdf_python_tools"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e19299aa28f63ae1056d6b86a4d2023"

SRC_URI[sha256sum] = "1f8a96971178333a55e083e35610d7688cd7620ad2b99790164e1fc1a3614c18"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

do_configure:prepend() {
    sed -i 's#"setuptools!=.*"#"setuptools"#g' ${S}/pyproject.toml
}

PYPI_PACKAGE = "domdf_python_tools"
