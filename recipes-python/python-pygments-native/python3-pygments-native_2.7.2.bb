SUMMARY = "Pygments is a syntax highlighting package written in Python"
HOMEPAGE = "http://pygments.org/"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1f5d0c4cf38dfc8122c00d6f1a97a0cc"

PYPI_PACKAGE = "Pygments"

SRC_URI[md5sum] = "cc5a6c0f34a958f879852d957a417742"
SRC_URI[sha256sum] = "381985fcc551eb9d37c52088a32914e00517e57f4a21609f48141ba08e193fa0"

inherit pypi
inherit setuptools3
inherit native
