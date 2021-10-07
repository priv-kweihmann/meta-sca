SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "e3e438bee12ef8086551387a406ffcb6"
SRC_URI[sha256sum] = "15fa0c3f0edec51ae53b528558f7fcc1beafa2ab08ba6068fa67509fffd432dc"

inherit pypi
inherit setuptools3
inherit native
