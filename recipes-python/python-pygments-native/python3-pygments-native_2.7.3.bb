SUMMARY = "Pygments is a syntax highlighting package written in Python"
HOMEPAGE = "http://pygments.org/"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1f5d0c4cf38dfc8122c00d6f1a97a0cc"

PYPI_PACKAGE = "Pygments"

SRC_URI[md5sum] = "3db74ee3bd11e1196dccf0b770c5d238"
SRC_URI[sha256sum] = "ccf3acacf3782cbed4a989426012f1c535c9a90d3a7fc3f16d231b9372d2b716"

inherit pypi
inherit setuptools3
inherit native
