SUMMARY = "flake8 plugin which checks for misuse of `sys.version` or `sys.version_info`"

HOMEPAGE = "https://github.com/asottile/flake8-2020"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0d8485a6f9c059042248e7a6b38e15c"

PYPI_PACKAGE = "flake8_2020"

UPSTREAM_CHECK_REGEX ?= "/flake8-2020/(?P<pver>(\d+[\.\-_]*)+)"

DEPENDS += " \
            ${PYTHON_PN}-flake8-native \
            "

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "642e9fb946c91bd696a90459264570ad"
SRC_URI[sha256sum] = "6226c9ef49c15bf4a0d7c07edb13653d9d02a44ba1e47c9385e07e17344f81d2"
