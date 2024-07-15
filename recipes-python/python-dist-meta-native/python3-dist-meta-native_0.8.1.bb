SUMMARY = "Parse and create Python distribution metadata."
HOMEPAGE = "https://github.com/repo-helper/dist-meta"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a484934fb535cddc2470eef202da5a2"

SRC_URI[sha256sum] = "e73b873b08361835e25592d4d74129f0353bca4451dd12bfa10aaf14af4682e4"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

do_configure:prepend() {
    sed -i 's#"setuptools!=.*"#"setuptools"#g' ${S}/pyproject.toml
}

PYPI_PACKAGE = "dist-meta"
