SUMMARY = "backport of Python standard library importlib.resources module"
HOMEPAGE = "https://github.com/python/importlib_resources"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e81780ac4c0888aaef94a7cb49b55edc"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_resources"

UPSTREAM_CHECK_REGEX ?= "/importlib-resources/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "0ae9c56e65f5c970075cbe9d900aed7b"
SRC_URI[sha256sum] = "1b93238cbf23b4cde34240dd8321d99e9bf2eb4bc91c0c99b2886283e7baad85"

inherit pypi
inherit python_setuptools_build_meta
inherit native
