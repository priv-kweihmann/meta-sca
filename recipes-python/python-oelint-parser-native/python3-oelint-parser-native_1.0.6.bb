SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "038bf496c4f57e29a16ea6d06eba5f34"
SRC_URI[sha256sum] = "b79e4f3d654e3c2e110d147270ada0f595772aac354587b57bfd9461c7178301"

inherit pypi
inherit native
inherit setuptools3
