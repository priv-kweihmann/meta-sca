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

SRC_URI[md5sum] = "b06eb6b13cb4d43f772fa051040d08c6"
SRC_URI[sha256sum] = "d66a600e1602736a0f24f725a511b0e50d12eb18f54b31ec276d2c26a0a62c6a"

inherit pypi
inherit setuptools3
inherit native
