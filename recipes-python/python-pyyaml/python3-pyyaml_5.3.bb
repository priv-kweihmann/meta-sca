SUMMARY = "PyYAML is a YAML parser and emitter for Python"
HOMEPAGE = "https://pyyaml.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a76b4c69bfcf82313bbdc0393b04438a"

PYPI_PACKAGE = "PyYAML"

SRC_URI[md5sum] = "adbb0d336b509d6472d3b095a0f1cf30"
SRC_URI[sha256sum] = "e9f45bd5b92c7974e59bcd2dcc8631a6b6cc380a904725fce7bc08872e691615"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
