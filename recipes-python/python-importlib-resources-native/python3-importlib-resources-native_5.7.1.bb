SUMMARY = "backport of Python standard library importlib.resources module"
HOMEPAGE = "https://github.com/python/importlib_resources"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e81780ac4c0888aaef94a7cb49b55edc"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_resources"

UPSTREAM_CHECK_REGEX ?= "/importlib-resources/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "c824bbb240390b1bf71bb9d5a7c4bc38"
SRC_URI[sha256sum] = "b6062987dfc51f0fcb809187cffbd60f35df7acb4589091f154214af6d0d49d3"

inherit pypi
inherit python_setuptools_build_meta
inherit native
