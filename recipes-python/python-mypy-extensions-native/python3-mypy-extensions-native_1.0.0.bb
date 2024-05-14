SUMMARY = "Type system extensions for programs checked with the mypy typechecker"
HOMEPAGE = "http://www.mypy-lang.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0fe3219e2470a78c0d1837019b8b426e"

PYPI_PACKAGE = "mypy_extensions"

UPSTREAM_CHECK_REGEX ?= "/mypy-extensions/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "5b77a3cafc7e9749a0157533c0915b5d"
SRC_URI[sha256sum] = "75dbf8955dc00442a438fc4d0666508a9a97b6bd41aa2f0ffe9d2f2725af0782"


inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"