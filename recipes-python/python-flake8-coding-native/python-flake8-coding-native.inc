SUMMARY = "Adds coding magic comment checks (coding:) to flake8"

HOMEPAGE = "https://github.com/tk0miya/flake8-coding"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "flake8-coding"

DEPENDS += " \
            ${PYTHON_PN}-flake8-native \
            "

inherit pypi
inherit native
