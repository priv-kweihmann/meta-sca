SUMMARY = "Backported and Experimental Type Hints for Python"
HOMEPAGE = "https://github.com/python/typing"

LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64fc2b30b67d0a8423c250e0386ed72f"

PYPI_PACKAGE = "typing_extensions"

UPSTREAM_CHECK_REGEX ?= "/typing-extensions/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "f2674282966dc088d10170c2347431cc"
SRC_URI[sha256sum] = "79ee589a3caca649a9bfd2a8de4709837400dfa00b6cc81962a1e6a1815969ae"

inherit pypi
inherit native
inherit setuptools3
