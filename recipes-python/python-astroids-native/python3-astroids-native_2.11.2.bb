SUMMARY = "A common base representation of python source code for pylint and other projects"
HOMEPAGE = "https://github.com/PyCQA/astroid"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPLv2"
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

SRC_URI[md5sum] = "9de722c4e485bb09e8610d565b7d5ee4"
SRC_URI[sha256sum] = "8d0a30fe6481ce919f56690076eafbb2fb649142a89dc874f1ec0e7a011492d0"

inherit pypi
inherit setuptools3
inherit native
