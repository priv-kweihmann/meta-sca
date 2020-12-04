SUMMARY = "a fast and memory efficient library for multi-pattern string search"
HOMEPAGE = "http://github.com/WojciechMula/pyahocorasick"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=629d983ff344da7b36a88f589f47ccc5"

PYPI_PACKAGE = "pyahocorasick"

SRC_URI[md5sum] = "7ce7a990146bae2095e7e5afd59d1d71"
SRC_URI[sha256sum] = "f9431a20e47e893cadd29f367825e882dbc6fc324a3c24c41e3ff9648e5d04b2"

inherit pypi
inherit native
inherit setuptools3
