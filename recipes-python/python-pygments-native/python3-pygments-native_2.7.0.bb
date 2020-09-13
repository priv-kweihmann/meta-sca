SUMMARY = "Pygments is a syntax highlighting package written in Python"
HOMEPAGE = "http://pygments.org/"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8fe739acbd3047be6e2fa69378fdd637"

PYPI_PACKAGE = "Pygments"

SRC_URI[md5sum] = "5ab12bdfafbf9fda3ef445d60b111a37"
SRC_URI[sha256sum] = "2594e8fdb06fef91552f86f4fd3a244d148ab24b66042036e64f29a291515048"

inherit pypi
inherit setuptools3
inherit native
