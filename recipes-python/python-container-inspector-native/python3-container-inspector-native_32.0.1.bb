SUMMARY = "suite of analysis utilities and command line tools for Docker images"
HOMEPAGE = "https://github.com/nexB/container-inspector"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "\
    python3-attrs-native \
    python3-click-native \
    python3-commoncode-native \
    python3-dockerfile-parse-native \
"

PYPI_PACKAGE = "container-inspector"

SRC_URI[sha256sum] = "6049eacf79f39c85c8dd7a6ce23a9466df4db7a7e69746fb203477080457c826"
SRC_URI:append = " file://0001-setup.cfg-fix-invalid-version-spec.patch"

inherit pypi
inherit setuptools3
inherit_defer native

UPSTREAM_CHECK_REGEX ?= "/container-inspector/(?P<pver>(\d+[\.\-_]*)+)"
