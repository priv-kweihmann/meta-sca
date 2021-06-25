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

SRC_URI[md5sum] = "b1933ac8d3b211617de9cc8e5ccf6d30"
SRC_URI[sha256sum] = "09bdb456e02564731f8b5957cdd0c98a7f01d2db5e90eb1d794c353c28bfd705"

inherit pypi
inherit setuptools3
inherit native
