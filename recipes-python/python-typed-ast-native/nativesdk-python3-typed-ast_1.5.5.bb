SUMMARY = "a fork of Python 2 and 3 ast modules with type comment support"
HOMEPAGE = "https://github.com/python/typed_ast"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0 & EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=97f1494e93daf66a5df47118407a4c4f"

PYPI_PACKAGE = "typed_ast"

UPSTREAM_CHECK_REGEX ?= "/typed-ast/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "7cd7a8c0635ad35aa709641046c04972"
SRC_URI[sha256sum] = "94282f7a354f36ef5dbce0ef3467ebf6a258e370ab33d5b40c249fa996e590dd"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-pytest \
"