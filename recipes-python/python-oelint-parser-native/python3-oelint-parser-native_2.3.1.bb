SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "ee1f2bbd8de49cd13de8f312d8ee8578"
SRC_URI[sha256sum] = "c89e13e1e9f1726b1df714863f83d4add190ec0358e578f8f8e6ae39b4728ba8"

inherit pypi
inherit setuptools3
inherit native
