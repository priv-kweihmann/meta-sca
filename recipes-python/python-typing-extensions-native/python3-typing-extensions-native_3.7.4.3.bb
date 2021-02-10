SUMMARY = "Backported and Experimental Type Hints for Python"
HOMEPAGE = "https://github.com/python/typing"

LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64fc2b30b67d0a8423c250e0386ed72f"

PYPI_PACKAGE = "typing_extensions"

UPSTREAM_CHECK_REGEX ?= "/typing-extensions/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "5fcbfcb22e6f8c9bf23fb9f8e020f6ee"
SRC_URI[sha256sum] = "99d4073b617d30288f569d3f13d2bd7548c3a7e4c8de87db09a9d29bb3a4a60c"

inherit pypi
inherit setuptools3
inherit native
