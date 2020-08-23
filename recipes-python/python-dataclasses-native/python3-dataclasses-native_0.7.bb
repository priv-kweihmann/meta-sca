SUMMARY = "A backport of the dataclasses module for Python 3.6"
HOMEPAGE = "https://github.com/ericvsmith/dataclasses"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "dataclasses"

SRC_URI[md5sum] = "969e12cac2b69ddc280758f76b481372"
SRC_URI[sha256sum] = "494a6dcae3b8bcf80848eea2ef64c0cc5cd307ffc263e17cdf42f3e5420808e6"

inherit pypi
inherit native
inherit setuptools3
