SUMMARY = "Type system extensions for programs checked with the mypy typechecker"
HOMEPAGE = "http://www.mypy-lang.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0fe3219e2470a78c0d1837019b8b426e"

PYPI_PACKAGE = "mypy_extensions"

UPSTREAM_CHECK_REGEX ?= "/mypy-extensions/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "4163ff73d0db8631c0a78bb55b551c84"
SRC_URI[sha256sum] = "2d82818f5bb3e369420cb3c4060a7970edba416647068eb4c5343488a6c604a8"


inherit pypi
inherit setuptools3
inherit native
