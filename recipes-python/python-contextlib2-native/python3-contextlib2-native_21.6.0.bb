SUMMARY = "contextlib2 is a backport of the standard library’s contextlib module"
HOMEPAGE = "http://contextlib2.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0 & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d2b6be100f1002194122ec9bfee7b8b4"

PYPI_PACKAGE = "contextlib2"

SRC_URI[md5sum] = "dcdca610617ab7fffc6fd99665567987"
SRC_URI[sha256sum] = "ab1e2bfe1d01d968e1b7e8d9023bc51ef3509bba217bb730cee3827e1ee82869"

UPSTREAM_CHECK_REGEX ?= "/contextlib2/(?P<pver>\d+\.\d+\.\d+(\.\w+)*)"

inherit pypi
inherit setuptools3
inherit native
