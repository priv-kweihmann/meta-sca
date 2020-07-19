SUMMARY = "Library to calculate Python functions cognitive complexity via code"
HOMEPAGE = "https://github.com/Melevir/cognitive_complexity"

LICENSE = "MIT"
# Module/repo doesn't offer an explict LICENSE
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "cognitive_complexity"

SRC_URI[md5sum] = "10dff62563a6ba5b0e16cf105065d19e"
SRC_URI[sha256sum] = "aeb9b71b48c7374a194c61ee70fb29d22977fe2b34da52a3236168ebf97d1f3a"

UPSTREAM_CHECK_REGEX ?= "/cognitive-complexity/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit native
inherit setuptools3
