SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "b9f15f11cde393d1959851ee9775fcda"
SRC_URI[sha256sum] = "e08270659717f6973523ce3afbafa53515c4dc5dcad637dc215b6fd50f689423"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
