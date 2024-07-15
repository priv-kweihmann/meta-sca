SUMMARY = "Extension to whey to support .pth files."
HOMEPAGE = "https://github.com/repo-helper/whey-pth"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a484934fb535cddc2470eef202da5a2"

SRC_URI[sha256sum] = "088a60ab33575b75694be93a042a5cd83372ab082dfc07f79ace7d007fd5e4a3"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

do_configure:prepend() {
    sed -i 's#"setuptools!=.*"#"setuptools"#g' ${S}/pyproject.toml
}

PYPI_PACKAGE = "whey-pth"
