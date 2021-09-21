SUMMARY = "More routines for operating on iterables, beyond itertools"
HOMEPAGE = "https://github.com/erikrose/more-itertools"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3396ea30f9d21389d7857719816f83b5"

SRC_URI[md5sum] = "9930552c4f7eedc00193673d5f7f0f19"
SRC_URI[sha256sum] = "1debcabeb1df793814859d64a81ad7cb10504c24349368ccf214c664c474f41f"

PYPI_PACKAGE = "more-itertools"

inherit pypi
inherit setuptools3
inherit native
