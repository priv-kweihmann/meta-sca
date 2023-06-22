SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd54c94e040946267bc2300dbc7d7e6d"

DEPENDS += "nativesdk-python3-flake8"

PYPI_PACKAGE = "flake8_comprehensions"

SRC_URI[md5sum] = "a0085f647eac7596e955a2d6066fb37b"
SRC_URI[sha256sum] = "83cf98e816c9e23360f36aaf47de59a5b21437fdff8a056c46e2ad49f81861bf"

UPSTREAM_CHECK_REGEX ?= "/flake8-comprehensions/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit python_setuptools_build_meta
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
