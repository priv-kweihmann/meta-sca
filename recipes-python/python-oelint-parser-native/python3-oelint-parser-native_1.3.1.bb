SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "002c7e51c33687c187e4b58a6da436f7"
SRC_URI[sha256sum] = "3c6e2fcf4cca2f67a3d3bad1901992d58cfa86ab955fd3c90bdaae465afbcc2e"

inherit pypi
inherit setuptools3
inherit native
