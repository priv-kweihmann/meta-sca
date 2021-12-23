SUMMARY = "backport of Python standard library importlib.resources module"
HOMEPAGE = "https://github.com/python/importlib_resources"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e81780ac4c0888aaef94a7cb49b55edc"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_resources"

UPSTREAM_CHECK_REGEX ?= "/importlib-resources/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "ef86f9f1bb77958b171afaafbedf6c91"
SRC_URI[sha256sum] = "d756e2f85dd4de2ba89be0b21dba2a3bbec2e871a42a3a16719258a11f87506b"

inherit pypi
inherit setuptools3
inherit native
