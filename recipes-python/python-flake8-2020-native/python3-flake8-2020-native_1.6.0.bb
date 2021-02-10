SUMMARY = "flake8 plugin which checks for misuse of `sys.version` or `sys.version_info`"
HOMEPAGE = "https://github.com/asottile/flake8-2020"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0d8485a6f9c059042248e7a6b38e15c"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8_2020"

UPSTREAM_CHECK_REGEX ?= "/flake8-2020/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "36dcfdf824ce5864c0ed157b10267a47"
SRC_URI[sha256sum] = "3e438d9d531577fbb9332bbd0bf394eca890f3b7a5311e2278fb3582381a2f13"

inherit pypi
inherit setuptools3
inherit native
