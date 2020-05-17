SUMMARY = "More routines for operating on iterables, beyond itertools"
HOMEPAGE = "https://github.com/erikrose/more-itertools"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3396ea30f9d21389d7857719816f83b5"

SRC_URI[md5sum] = "03dbc82ec1c4e814733d84abf79f43f0"
SRC_URI[sha256sum] = "558bb897a2232f5e4f8e2399089e35aecb746e1f9191b6584a151647e89267be"

PYPI_PACKAGE = "more-itertools"

inherit pypi
inherit native
inherit setuptools3
