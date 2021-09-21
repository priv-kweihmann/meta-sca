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

SRC_URI[md5sum] = "10b42c1cc1b7ac2fc0e1a1dc54cf31cf"
SRC_URI[sha256sum] = "fe81f80c0b35264acb5653302ffbd935d394f1775c5e4487df745bf9c2442708"

inherit pypi
inherit setuptools3
inherit native
