SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

DEPENDS += "python3-regex-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[sha256sum] = "2d3a81f6d241d15c25ce38630fbf1d74c6e7c0ee22c21258b0c530f3c16a30e6"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-regex"
