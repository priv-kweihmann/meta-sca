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

SRC_URI[md5sum] = "3803355e3d40d2179b13df082f1425f9"
SRC_URI[sha256sum] = "3b680ce0419b8a771aba6190139a3998d14b413852506d99aff8dc2bf65ee67c"

inherit pypi
inherit setuptools3
inherit native
