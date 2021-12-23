SUMMARY = "flake8 plugin which checks for misuse of `sys.version` or `sys.version_info`"
HOMEPAGE = "https://github.com/asottile/flake8-2020"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0d8485a6f9c059042248e7a6b38e15c"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8_2020"

UPSTREAM_CHECK_REGEX ?= "/flake8-2020/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "d0ad923dc1993140092fe119dcc8682c"
SRC_URI[sha256sum] = "db523e3383befc17c895219551ff6c9b2f6e0a5cae4c7739ea65a2238bdc6f74"

inherit pypi
inherit setuptools3
inherit native
