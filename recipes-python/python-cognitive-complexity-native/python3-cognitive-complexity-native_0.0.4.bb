SUMMARY = "Library to calculate Python functions cognitive complexity via code"
HOMEPAGE = "https://github.com/Melevir/cognitive_complexity"

LICENSE = "MIT"
# Module/repo doesn't offer an explict LICENSE
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "cognitive_complexity"

SRC_URI[md5sum] = "abc4b7be008f16122b0cf990e0966028"
SRC_URI[sha256sum] = "8a456bf2871a40c73f33c937ec0b42bc2daaefafa850b3158b0f7a2a91af2b64"

UPSTREAM_CHECK_REGEX ?= "/cognitive-complexity/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit native
inherit setuptools3
