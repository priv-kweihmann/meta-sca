SUMMARY = "a fork of Python 2 and 3 ast modules with type comment support"
HOMEPAGE = "https://github.com/python/typed_ast"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0 & EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=97f1494e93daf66a5df47118407a4c4f"

PYPI_PACKAGE = "typed_ast"

UPSTREAM_CHECK_REGEX ?= "/typed-ast/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "47d3b977b1dd121c5b4bd1c8777f0e24"
SRC_URI[sha256sum] = "484137cab8ecf47e137260daa20bafbba5f4e3ec7fda1c1e69ab299b75fa81c5"

inherit pypi
inherit setuptools3
inherit native
