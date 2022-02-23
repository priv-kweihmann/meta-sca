SUMMARY = "a fast and memory efficient library for multi-pattern string search"
HOMEPAGE = "http://github.com/WojciechMula/pyahocorasick"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=629d983ff344da7b36a88f589f47ccc5"

PYPI_PACKAGE = "pyahocorasick"

SRC_URI[md5sum] = "fde609ca3bd7e3f9ba271eaaaea13569"
SRC_URI[sha256sum] = "32545cad135660ceef556f1d987aee3206e00096735405d7a8de84eb0a15bb27"

inherit pypi
inherit setuptools3
inherit native
