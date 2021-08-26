SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "3628d9ac5307a745b61b865cddef8b0c"
SRC_URI[sha256sum] = "4961f47ac847351b983b2ab403b7099885300e2e3a3dd304416e6a22d03f4cba"

inherit pypi
inherit setuptools3
inherit native
