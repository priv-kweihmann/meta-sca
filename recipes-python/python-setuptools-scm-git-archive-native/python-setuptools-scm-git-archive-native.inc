SUMMARY = "setuptools_scm plugin for git archives"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

PYPI_PACKAGE = "setuptools_scm_git_archive"
inherit pypi

DEPENDS = "${PYTHON_PN}-setuptools-scm-native"

inherit native
