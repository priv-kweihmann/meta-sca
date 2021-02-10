SUMMARY = "More routines for operating on iterables, beyond itertools"
HOMEPAGE = "https://github.com/erikrose/more-itertools"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3396ea30f9d21389d7857719816f83b5"

SRC_URI[md5sum] = "8bcd89c5128c4b983fa740edd6084980"
SRC_URI[sha256sum] = "b3a9005928e5bed54076e6e549c792b306fddfe72b2d1d22dd63d42d5d3899cf"

PYPI_PACKAGE = "more-itertools"

inherit pypi
inherit setuptools3
inherit native
