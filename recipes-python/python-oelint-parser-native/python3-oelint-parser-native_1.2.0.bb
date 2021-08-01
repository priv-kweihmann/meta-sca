SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "e17e17e0411fff6c52296319656e0ec5"
SRC_URI[sha256sum] = "4892ed8ae806551d412628e316a701bd7a356bff8ceb9dd2dcf4be72235710f8"

inherit pypi
inherit setuptools3
inherit native
