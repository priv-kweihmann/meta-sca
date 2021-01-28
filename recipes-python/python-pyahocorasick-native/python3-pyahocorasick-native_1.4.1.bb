SUMMARY = "a fast and memory efficient library for multi-pattern string search"
HOMEPAGE = "http://github.com/WojciechMula/pyahocorasick"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=629d983ff344da7b36a88f589f47ccc5"

PYPI_PACKAGE = "pyahocorasick"

SRC_URI[md5sum] = "85c9878f93b1ef03819b1b5b3ef5df42"
SRC_URI[sha256sum] = "fe076da3b0b20dbb619b0fb6478af8766b06679c0e359a2bfb189d3f07ddeecf"

inherit pypi
inherit native
inherit setuptools3
