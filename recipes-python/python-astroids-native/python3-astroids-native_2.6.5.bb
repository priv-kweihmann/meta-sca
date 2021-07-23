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

SRC_URI[md5sum] = "0105a4a3746cbe7163a72f6c48d52988"
SRC_URI[sha256sum] = "83e494b02d75d07d4e347b27c066fd791c0c74fc96c613d1ea3de0c82c48168f"

inherit pypi
inherit setuptools3
inherit native
