SUMMARY = "A port of Ruby on Rails inflector to Python"
HOMEPAGE = "https://github.com/jpvanhal/inflection"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2fb6fa1a6f1792d78de19ad1bb653c31"

PYPI_PACKAGE = "inflection"

SRC_URI[sha256sum] = "1a29730d366e996aaacffb2f1f1cb9593dc38e2ddd30c91250c6dde09ea9b417"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
