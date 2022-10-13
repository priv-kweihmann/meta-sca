SUMMARY = "Backported and Experimental Type Hints for Python"
HOMEPAGE = "https://github.com/python/typing"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64fc2b30b67d0a8423c250e0386ed72f"

PYPI_PACKAGE = "typing_extensions"

UPSTREAM_CHECK_REGEX ?= "/typing-extensions/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "5cfcb56ea6fc4972c3600c0030f4d136"
SRC_URI[sha256sum] = "1511434bb92bf8dd198c12b1cc812e800d4181cfcb867674e0f8279cc93087aa"

inherit pypi
inherit setuptools3
inherit nativesdk
