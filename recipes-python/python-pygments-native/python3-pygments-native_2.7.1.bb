SUMMARY = "Pygments is a syntax highlighting package written in Python"
HOMEPAGE = "http://pygments.org/"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1f5d0c4cf38dfc8122c00d6f1a97a0cc"

PYPI_PACKAGE = "Pygments"

SRC_URI[md5sum] = "8b4d5fe67fde78e9cf7eab088b341bfb"
SRC_URI[sha256sum] = "926c3f319eda178d1bd90851e4317e6d8cdb5e292a3386aac9bd75eca29cf9c7"

inherit pypi
inherit setuptools3
inherit native
