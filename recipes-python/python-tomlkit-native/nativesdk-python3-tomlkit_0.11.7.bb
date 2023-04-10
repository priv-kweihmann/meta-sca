SUMMARY = "Style-preserving TOML library for Python"
HOMEPAGE = "https://github.com/sdispater/tomlkit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31aac0dbc1babd278d5386dadb7f8e82"

PYPI_PACKAGE = "tomlkit"

SRC_URI[sha256sum] = "f392ef70ad87a672f02519f99967d28a4d3047133e2d1df936511465fbb3791d"

inherit pypi
inherit python_poetry_core
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-datetime \
    nativesdk-python3-stringold \
"
