SUMMARY = "flake8 plugin which checks for misuse of `sys.version` or `sys.version_info`"
HOMEPAGE = "https://github.com/asottile/flake8-2020"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0d8485a6f9c059042248e7a6b38e15c"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8_2020"

UPSTREAM_CHECK_REGEX ?= "/flake8-2020/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "e2d9e43f6d4f4f6d7b117fe128946c6b"
SRC_URI[sha256sum] = "9342902563a7d0b0233128c395be1372b8a3e8072805931639760bfe8a3935f9"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
