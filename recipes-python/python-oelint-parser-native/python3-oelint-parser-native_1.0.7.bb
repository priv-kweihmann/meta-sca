SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "2f40c359f862f8e8b9811db65ca57184"
SRC_URI[sha256sum] = "15f84b9daa4afeb3e072e854343a01a4377bc7377162e378c64413396a626e63"

inherit pypi
inherit setuptools3
inherit native
