SUMMARY = "Flake8 plugin for return expressions checking"
HOMEPAGE = "https://github.com/afonasev/flake8-return"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=07bb8b67f060dbf5fd8060a8a60d4a28"

DEPENDS += "\
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-plugin-utils \
"

PYPI_PACKAGE = "flake8-return"

SRC_URI:append = " file://0001-Use-poetry-core-for-pyproject-based-builds.patch"

SRC_URI[sha256sum] = "68dfa56582cd704febd02ad86dcf5df67e38e0836d62f1ceae7930d76d3dd955"

inherit pypi
inherit python_poetry_core
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-plugin-utils \
"
