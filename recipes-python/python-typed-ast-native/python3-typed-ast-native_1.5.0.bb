SUMMARY = "a fork of Python 2 and 3 ast modules with type comment support"
HOMEPAGE = "https://github.com/python/typed_ast"

DEFAULT_PREFERENCE = "-1"
LICENSE = "Apache-2.0 & EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=97f1494e93daf66a5df47118407a4c4f"

PYPI_PACKAGE = "typed_ast"

UPSTREAM_CHECK_REGEX ?= "/typed-ast/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "c10e924e90f70312eb0303afb5293670"
SRC_URI[sha256sum] = "ff4ad88271aa7a55f19b6a161ed44e088c393846d954729549e3cde8257747bb"

inherit pypi
inherit setuptools3
inherit native
