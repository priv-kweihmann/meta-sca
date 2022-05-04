SUMMARY = "Backported and Experimental Type Hints for Python"
HOMEPAGE = "https://github.com/python/typing"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64fc2b30b67d0a8423c250e0386ed72f"

PYPI_PACKAGE = "typing_extensions"

UPSTREAM_CHECK_REGEX ?= "/typing-extensions/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "197fb153e3720a3f6e0c85bb47f9c2b5"
SRC_URI[sha256sum] = "f1c24655a0da0d1b67f07e17a5e6b2a105894e6824b92096378bb3668ef02376"

inherit pypi
inherit setuptools3
inherit native
