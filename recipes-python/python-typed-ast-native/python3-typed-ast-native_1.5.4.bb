SUMMARY = "a fork of Python 2 and 3 ast modules with type comment support"
HOMEPAGE = "https://github.com/python/typed_ast"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0 & EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=97f1494e93daf66a5df47118407a4c4f"

PYPI_PACKAGE = "typed_ast"

UPSTREAM_CHECK_REGEX ?= "/typed-ast/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "1b0183d362a886a447d8314a97bc37b3"
SRC_URI[sha256sum] = "39e21ceb7388e4bb37f4c679d72707ed46c2fbf2a5609b8b8ebc4b067d977df2"

inherit pypi
inherit setuptools3
inherit native
