SUMMARY = "Style-preserving TOML library for Python"
HOMEPAGE = "https://github.com/sdispater/tomlkit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31aac0dbc1babd278d5386dadb7f8e82"

PYPI_PACKAGE = "tomlkit"

SRC_URI[sha256sum] = "83e32755ba1d20d9340bd069ee97e9f6232ba2346b63ffcba425de01f7e327a6"

inherit pypi
inherit python_poetry_core
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-datetime \
    nativesdk-python3-stringold \
"
