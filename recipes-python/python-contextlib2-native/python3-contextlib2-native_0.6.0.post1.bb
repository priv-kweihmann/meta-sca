SUMMARY = "contextlib2 is a backport of the standard library’s contextlib module"
HOMEPAGE = "http://contextlib2.readthedocs.org/"

LICENSE = "PSF-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=43d1c7827e8fad6454b553caf0e1d734"

PYPI_PACKAGE = "contextlib2"

SRC_URI[md5sum] = "d634281c2e61e575d8a68b9c56f8303a"
SRC_URI[sha256sum] = "01f490098c18b19d2bd5bb5dc445b2054d2fa97f09a4280ba2c5f3c394c8162e"

UPSTREAM_CHECK_REGEX ?= "/contextlib2/(?P<pver>\d+\.\d+\.\d+(\.\w+)*)"

inherit pypi
inherit setuptools3
inherit native
