SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "352d0d32a97834cc372f4b369ee8f263"
SRC_URI[sha256sum] = "c078fcfa608cf04cb9e7e0c038dbc3bba551f6c4cff15f2eeeeadf212fac749e"

inherit pypi
inherit setuptools3
inherit native
