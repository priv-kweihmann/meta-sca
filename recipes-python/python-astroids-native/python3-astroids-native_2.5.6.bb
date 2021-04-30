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

SRC_URI[md5sum] = "3d3f9a8ebe07680184dc9ae1fe7c3fe3"
SRC_URI[sha256sum] = "8a398dfce302c13f14bab13e2b14fe385d32b73f4e4853b9bdfb64598baa1975"

inherit pypi
inherit setuptools3
inherit native
