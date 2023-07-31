SUMMARY = "Style-preserving TOML library for Python"
HOMEPAGE = "https://github.com/sdispater/tomlkit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31aac0dbc1babd278d5386dadb7f8e82"

PYPI_PACKAGE = "tomlkit"

SRC_URI[sha256sum] = "38e1ff8edb991273ec9f6181244a6a391ac30e9f5098e7535640ea6be97a7c86"

inherit pypi
inherit python_poetry_core
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-datetime \
    nativesdk-python3-stringold \
"
