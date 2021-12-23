SUMMARY = "A lil' TOML parser"
DESCRIPTION = "Tomli is a Python library for parsing TOML. Tomli is fully compatible with TOML v1.0.0."
HOMEPAGE = "https://github.com/hukkin/tomli"
BUGTRACKER = "https://github.com/hukkin/tomli/issues"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aaaaf0879d17df0110d1aa8c8c9f46f5"

SRC_URI[sha256sum] = "c6ce0015eb38820eaf32b5db832dbc26deb3dd427bd5f6556cf0acac2c214fee"

PYPI_PACKAGE = "tomli"

inherit pypi
inherit setuptools3
inherit native

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup
setup(name="tomli", version="${PV}", packages=["tomli"], package_data={"": ["*"]})
EOF
}
