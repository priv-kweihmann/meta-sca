SUMMARY = "Library to calculate Python functions cognitive complexity via code"
HOMEPAGE = "https://github.com/Melevir/cognitive_complexity"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=535dcde9d395e0ffc8bea1b3e738bed0"

PYPI_PACKAGE = "cognitive_complexity"

SRC_URI[md5sum] = "eb2718408f8667e6ee11143aa04340fe"
SRC_URI[sha256sum] = "a0cfbd47dee0b19f4056f892389f501694b205c3af69fb703cc744541e03dde5"
SRC_URI[license.md5sum] = "535dcde9d395e0ffc8bea1b3e738bed0"
SRC_URI[license.sha256sum] = "606ac64848bc8293ed15cb9195dab80b75907c5826156c2139fe8f9df37db1fc"

UPSTREAM_CHECK_REGEX ?= "/cognitive-complexity/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
