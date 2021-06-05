SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "69d5146bc71d26ec40325ffb6aa2c858"
SRC_URI[sha256sum] = "d192eb070439fd6e4ef7dd0e9a82fc246d96ac1e4323259c76e421b01e6ff713"

inherit pypi
inherit setuptools3
inherit native
