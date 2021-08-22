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

SRC_URI[md5sum] = "5ef20fa544489da581fe6b7a153b069a"
SRC_URI[sha256sum] = "b6c2d75cd7c2982d09e7d41d70213e863b3ba34d3bd4014e08f167cee966e99e"

inherit pypi
inherit setuptools3
inherit native
