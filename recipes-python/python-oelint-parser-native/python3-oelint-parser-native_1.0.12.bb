SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "5c4c3b4fb3af573347201e8bf4a542cb"
SRC_URI[sha256sum] = "4bd1cd108022d48643486971716fa760d3dccb7e75d13eae77809a398e0e70d0"

inherit pypi
inherit setuptools3
inherit native
