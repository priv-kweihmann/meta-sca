SUMMARY = "A backport of the dataclasses module for Python 3.6"
HOMEPAGE = "https://github.com/ericvsmith/dataclasses"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "dataclasses"

SRC_URI[md5sum] = "c9a52e322ada1406bfde9ebe3cdbbcca"
SRC_URI[sha256sum] = "8479067f342acf957dc82ec415d355ab5edb7e7646b90dc6e2fd1d96ad084c97"

inherit pypi
inherit native
inherit setuptools3
