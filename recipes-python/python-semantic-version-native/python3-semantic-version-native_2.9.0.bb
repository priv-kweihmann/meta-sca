SUMMARY = "A library implementing the 'SemVer' scheme."
HOMEPAGE = "https://github.com/rbarrois/python-semanticversion"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fb31e3c1c7eeb8b5e8c07657cdd54e2"

PYPI_PACKAGE = "semantic_version"

UPSTREAM_CHECK_REGEX ?= "/semantic-version/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "1c79ce65c87479473223a642d2cbc3c2"
SRC_URI[sha256sum] = "abf54873553e5e07a6fd4d5f653b781f5ae41297a493666b59dcf214006a12b2"

inherit pypi
inherit setuptools3
inherit native
