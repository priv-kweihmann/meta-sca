SUMMARY = "flake8 plugin which checks for misuse of `sys.version` or `sys.version_info`"

HOMEPAGE = "https://github.com/asottile/flake8-2020"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0d8485a6f9c059042248e7a6b38e15c"

PYPI_PACKAGE = "flake8_2020"

DEPENDS += " \
            ${PYTHON_PN}-flake8-native \
            "

inherit pypi
inherit native
