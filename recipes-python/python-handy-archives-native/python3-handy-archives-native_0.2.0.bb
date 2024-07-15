SUMMARY = "Some handy archive helpers for Python."
HOMEPAGE = "https://github.com/domdfcoding/handy-archives"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a484934fb535cddc2470eef202da5a2"

SRC_URI[sha256sum] = "fba21101fd9e29d5e3b72823261aaae06b9350686f0d2067786d64dce73eb3f6"

inherit pypi
inherit python_flit_core
inherit_defer native

PYPI_PACKAGE = "handy_archives"
