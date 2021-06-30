SUMMARY = "A common base representation of python source code for pylint and other projects"
HOMEPAGE = "https://github.com/PyCQA/astroid"

LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a70cf540abf41acb644ac3b621b2fad1"

DEPENDS += "\
            python3-native \
            python3-pylazy-object-proxy-native \
            python3-pytest-runner-native \
            python3-typed-ast-native \
            python3-wrapt-native \
            "

PYPI_PACKAGE = "astroid"

SRC_URI[md5sum] = "e2894dce04d77ad3c87bf4c349a16801"
SRC_URI[sha256sum] = "19fd2d2e12bc3cae95687e8264b6593fe07339181a273eeb095da0e70faf4399"

inherit pypi
inherit setuptools3
inherit native
