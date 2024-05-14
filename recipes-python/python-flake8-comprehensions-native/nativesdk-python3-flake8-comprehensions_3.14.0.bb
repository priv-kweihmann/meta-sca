SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd54c94e040946267bc2300dbc7d7e6d"

DEPENDS += "nativesdk-python3-flake8"

PYPI_PACKAGE = "flake8_comprehensions"

SRC_URI[md5sum] = "10e1042bd65bd1f4b151779f7f6acf82"
SRC_URI[sha256sum] = "81768c61bfc064e1a06222df08a2580d97de10cb388694becaf987c331c6c0cf"

UPSTREAM_CHECK_REGEX ?= "/flake8-comprehensions/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
