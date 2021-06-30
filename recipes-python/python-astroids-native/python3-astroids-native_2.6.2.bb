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

SRC_URI[md5sum] = "198f41f9b07ce563eb9dba2dbe5f316b"
SRC_URI[sha256sum] = "38b95085e9d92e2ca06cf8b35c12a74fa81da395a6f9e65803742e6509c05892"

inherit pypi
inherit setuptools3
inherit native
