SUMMARY = "setuptools_scm plugin for git archives"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

PYPI_PACKAGE = "setuptools_scm_git_archive"

DEPENDS = "${PYTHON_PN}-setuptools-scm-native"

UPSTREAM_CHECK_REGEX ?= "/setuptools-scm-git-archive/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "1c9351fa5cebd12e76488737a7c78f2e"
SRC_URI[sha256sum] = "6026f61089b73fa1b5ee737e95314f41cb512609b393530385ed281d0b46c062"
