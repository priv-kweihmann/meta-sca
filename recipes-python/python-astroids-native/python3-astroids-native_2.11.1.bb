SUMMARY = "A common base representation of python source code for pylint and other projects"
HOMEPAGE = "https://github.com/PyCQA/astroid"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a70cf540abf41acb644ac3b621b2fad1"

DEPENDS += "\
    python3-native \
    python3-pylazy-object-proxy-native \
    python3-pytest-runner-native \
    python3-typed-ast-native \
    python3-typing-extensions-native \
    python3-wrapt-native \
"

PYPI_PACKAGE = "astroid"

SRC_URI[md5sum] = "70a00fb2198b9a22170c161e05a61d06"
SRC_URI[sha256sum] = "33f1c15fe9661348a50b7ec6789947089ead2a5de727bb4782d530d9d2fff2c8"

inherit pypi
inherit setuptools3
inherit native
