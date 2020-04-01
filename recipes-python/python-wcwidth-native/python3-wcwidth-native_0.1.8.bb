SUMMARY = "Python library that measures the width of unicode strings rendered to a terminal"
HOMEPAGE = "https://github.com/jquast/wcwidth"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=11fba47286258744a6bc6e43530c32a1"

PYPI_PACKAGE = "wcwidth"

SRC_URI[md5sum] = "dc6677d099e6f49c0f6fbc310de261e9"
SRC_URI[sha256sum] = "f28b3e8a6483e5d49e7f8949ac1a78314e740333ae305b4ba5defd3e74fb37a8"

inherit pypi
inherit native
inherit setuptools3
