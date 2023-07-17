SUMMARY = "The package provides base classes and utils for flake8 plugin writing"
HOMEPAGE = "https://github.com/afonasev/flake8-plugin-utils"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=07bb8b67f060dbf5fd8060a8a60d4a28"

DEPENDS += "nativesdk-python3-flake8"

PYPI_PACKAGE = "flake8-plugin-utils"

SRC_URI:append = " file://0001-Use-poetry-core-for-pyproject-based-builds.patch"

SRC_URI[sha256sum] = "39f6f338d038b301c6fd344b06f2e81e382b68fa03c0560dff0d9b1791a11a2c"

inherit pypi
inherit python_poetry_core
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
