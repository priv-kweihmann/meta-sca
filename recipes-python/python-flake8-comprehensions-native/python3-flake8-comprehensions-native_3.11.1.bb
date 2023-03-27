SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd54c94e040946267bc2300dbc7d7e6d"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8_comprehensions"

SRC_URI[md5sum] = "3257a0a79760a4ec16a05e1854974103"
SRC_URI[sha256sum] = "31d6386c125e325d7c84290d71f5354295dbbf5a8d47259708fa349aa0969523"

UPSTREAM_CHECK_REGEX ?= "/flake8-comprehensions/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit python_setuptools_build_meta
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
