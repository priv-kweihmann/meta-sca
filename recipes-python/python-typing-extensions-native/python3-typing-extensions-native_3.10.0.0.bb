SUMMARY = "Backported and Experimental Type Hints for Python"
HOMEPAGE = "https://github.com/python/typing"

LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64fc2b30b67d0a8423c250e0386ed72f"

PYPI_PACKAGE = "typing_extensions"

UPSTREAM_CHECK_REGEX ?= "/typing-extensions/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "9b5b33ae64c94479fa0862cf8ae89d58"
SRC_URI[sha256sum] = "50b6f157849174217d0656f99dc82fe932884fb250826c18350e159ec6cdf342"

inherit pypi
inherit setuptools3
inherit native
