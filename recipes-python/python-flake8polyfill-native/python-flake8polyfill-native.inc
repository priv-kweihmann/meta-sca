SUMMARY = "Polyfill package for Flake8 plugins"
DESCRIPTION = "Polyfill package for Flake8 plugins"
HOMEPAGE = "https://gitlab.com/pycqa/flake8-polyfill"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4638d28f0c4a8f3900ce3e309d204b73"

PYPI_PACKAGE = "flake8-polyfill"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native
