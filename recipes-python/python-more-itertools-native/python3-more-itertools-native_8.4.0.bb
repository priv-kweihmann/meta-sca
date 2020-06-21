SUMMARY = "More routines for operating on iterables, beyond itertools"
HOMEPAGE = "https://github.com/erikrose/more-itertools"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3396ea30f9d21389d7857719816f83b5"

SRC_URI[md5sum] = "0912041c05148ed079984cff69af2e99"
SRC_URI[sha256sum] = "68c70cc7167bdf5c7c9d8f6954a7837089c6a36bf565383919bb595efb8a17e5"

PYPI_PACKAGE = "more-itertools"

inherit pypi
inherit native
inherit setuptools3
