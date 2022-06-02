SUMMARY = "Style-preserving TOML library for Python"
HOMEPAGE = "https://github.com/sdispater/tomlkit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31aac0dbc1babd278d5386dadb7f8e82"

PYPI_PACKAGE = "tomlkit"

SRC_URI[sha256sum] = "71ceb10c0eefd8b8f11fe34e8a51ad07812cb1dc3de23247425fbc9ddc47b9dd"

inherit pypi
inherit python_poetry_core
inherit native
