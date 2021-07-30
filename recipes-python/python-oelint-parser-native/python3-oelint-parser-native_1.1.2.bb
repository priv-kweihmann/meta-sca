SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "4de05d5eda4d2f555d7165742f7b2063"
SRC_URI[sha256sum] = "ab3325f90f211b51b5032495f90dd8afe1898100c0a28e0503fce41652f33fc0"

inherit pypi
inherit setuptools3
inherit native
