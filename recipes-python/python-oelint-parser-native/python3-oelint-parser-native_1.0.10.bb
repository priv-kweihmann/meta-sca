SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint_parser"

UPSTREAM_CHECK_REGEX ?= "/oelint-parser/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "8ba14174e1c3a27645717affea72a9d6"
SRC_URI[sha256sum] = "8f597d214cde9412b7d974b7daf6f9f44f4a30e0fe09d9decf7209ffffd9890c"

inherit pypi
inherit setuptools3
inherit native
