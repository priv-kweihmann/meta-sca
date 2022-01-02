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

SRC_URI[md5sum] = "af3a03642f52c7c218232ff304c73008"
SRC_URI[sha256sum] = "f973b3622700431b6e8734ce66f6c18503922a13fb8eb8592e78bd4506823efb"

inherit pypi
inherit setuptools3
inherit native
