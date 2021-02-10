SUMMARY = "More routines for operating on iterables, beyond itertools"
HOMEPAGE = "https://github.com/erikrose/more-itertools"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3396ea30f9d21389d7857719816f83b5"

SRC_URI[md5sum] = "a6aa74a631a7d81750e00b44404512c0"
SRC_URI[sha256sum] = "c5d6da9ca3ff65220c3bfd2a8db06d698f05d4d2b9be57e1deb2be5a45019713"

PYPI_PACKAGE = "more-itertools"

inherit pypi
inherit setuptools3
inherit native
