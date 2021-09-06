SUMMARY = "More routines for operating on iterables, beyond itertools"
HOMEPAGE = "https://github.com/erikrose/more-itertools"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3396ea30f9d21389d7857719816f83b5"

SRC_URI[md5sum] = "7b9ea510f5ed55b40141e73006ff5319"
SRC_URI[sha256sum] = "8c746e0d09871661520da4f1241ba6b908dc903839733c8203b552cffaf173bd"

PYPI_PACKAGE = "more-itertools"

inherit pypi
inherit setuptools3
inherit native
