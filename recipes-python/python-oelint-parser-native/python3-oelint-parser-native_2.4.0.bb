SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "7124186740b21a72c9cdf0fd1c53acce"
SRC_URI[sha256sum] = "5c0dd5c119bb5a808f4c3ac8d53e6df7a95a6f8ddc3868515a86ddf4ec9696a7"

inherit pypi
inherit setuptools3
inherit native
