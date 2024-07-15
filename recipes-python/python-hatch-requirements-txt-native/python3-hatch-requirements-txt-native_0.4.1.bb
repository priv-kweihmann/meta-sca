SUMMARY = "Hatchling plugin to read project dependencies from requirements.txt"
HOMEPAGE = "https://github.com/repo-helper/hatch-requirements-txt"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=58206c261591d2c13b00ab61cec32abe"

DEPENDS = "python3-hatchling-native"
SRC_URI[sha256sum] = "2c686e5758fd05bb55fa7d0c198fdd481f8d3aaa3c693260f5c0d74ce3547d20"

inherit pypi
inherit python_hatchling
inherit_defer native

PYPI_PACKAGE = "hatch_requirements_txt"
