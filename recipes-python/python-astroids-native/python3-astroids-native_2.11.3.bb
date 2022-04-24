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

SRC_URI[md5sum] = "d574b0b66b262ff57dcdf9cc2b498ef6"
SRC_URI[sha256sum] = "4e5ba10571e197785e312966ea5efb2f5783176d4c1a73fa922d474ae2be59f7"

inherit pypi
inherit setuptools3
inherit native
