SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "d654ac5735a033c0851e93e253db1f7d"
SRC_URI[sha256sum] = "7e14749923e19d4fe6a94b5c7f4a5170b5b467ebe9fb62b6df4e214f85a6ffa6"

inherit pypi
inherit native
inherit setuptools3
