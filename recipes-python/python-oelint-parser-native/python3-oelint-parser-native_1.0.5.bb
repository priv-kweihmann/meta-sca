SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "84b3a65b439592e1f25bafde488210b9"
SRC_URI[sha256sum] = "48b9756f4ef49da5e8e05971bcbd7061940603bbd60c33264276ab12372fcfa8"

inherit pypi
inherit native
inherit setuptools3
