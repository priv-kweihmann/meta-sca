SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd54c94e040946267bc2300dbc7d7e6d"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8_comprehensions"

SRC_URI[md5sum] = "e442da8ed9b6c9991fce946e0ba15fda"
SRC_URI[sha256sum] = "419ef1a6e8de929203791a5e8ff5e3906caeba13eb3290eebdbf88a9078d502e"

UPSTREAM_CHECK_REGEX ?= "/flake8-comprehensions/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit python_setuptools_build_meta
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
