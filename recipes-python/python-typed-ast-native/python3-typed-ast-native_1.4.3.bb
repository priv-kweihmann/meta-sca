SUMMARY = "a fork of Python 2 and 3 ast modules with type comment support"
HOMEPAGE = "https://github.com/python/typed_ast"

LICENSE = "Apache-2.0 & EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=97f1494e93daf66a5df47118407a4c4f"

PYPI_PACKAGE = "typed_ast"

UPSTREAM_CHECK_REGEX ?= "/typed-ast/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "a48fe4c5ef52b0af3188684dd28ca41c"
SRC_URI[sha256sum] = "fb1bbeac803adea29cedd70781399c99138358c26d05fcbd23c13016b7f5ec65"

inherit pypi
inherit setuptools3
inherit native
