SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd54c94e040946267bc2300dbc7d7e6d"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8_comprehensions"

SRC_URI[md5sum] = "a750a19cff2773ea80d66e20932e1667"
SRC_URI[sha256sum] = "923c22603e0310376a6b55b03efebdc09753c69f2d977755cba8bb73458a5d4d"

UPSTREAM_CHECK_REGEX ?= "/flake8-comprehensions/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
