SUMMARY = "Simple, fast, extensible JSON encoder/decoder for Python"
HOMEPAGE = "https://github.com/simplejson/simplejson"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT & AFL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c6338d7abd321c0b50a2a547e441c52e"

PYPI_PACKAGE = "simplejson"

SRC_URI[md5sum] = "cf9d47d04d93ac034f20eedd17a46aaf"
SRC_URI[sha256sum] = "6197cfebe659ac802a686b5408494115a7062b45cdf37679c4d6a9d4f39649b7"

inherit pypi
inherit setuptools3
inherit native
