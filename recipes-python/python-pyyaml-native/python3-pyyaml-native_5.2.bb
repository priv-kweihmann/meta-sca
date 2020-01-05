SUMMARY = "PyYAML is a YAML parser and emitter for Python."
DESCRIPTION = "PyYAML is a YAML parser and emitter for Python."
HOMEPAGE = "https://pyyaml.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a76b4c69bfcf82313bbdc0393b04438a"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "PyYAML"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "d7e45e932d6e6649ac574a1ed77b4269"
SRC_URI[sha256sum] = "c0ee8eca2c582d29c3c2ec6e2c4f703d1b7f1fb10bc72317355a746057e7346c"
