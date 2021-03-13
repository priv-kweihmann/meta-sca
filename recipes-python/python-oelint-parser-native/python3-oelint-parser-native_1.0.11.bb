SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "bac58fcf1eef8a1d92373256b35cb487"
SRC_URI[sha256sum] = "f890affce5e581804e3f4ebd29fc88fabcf02dc253f9eb0f7146d9b5ed927749"

inherit pypi
inherit setuptools3
inherit native
