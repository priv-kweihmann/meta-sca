SUMMARY = "PyYAML is a YAML parser and emitter for Python"
HOMEPAGE = "https://pyyaml.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7bbd28caa69f81f5cd5f48647236663d"

PYPI_PACKAGE = "PyYAML"

SRC_URI[md5sum] = "d3590b85917362e837298e733321962b"
SRC_URI[sha256sum] = "b8eac752c5e14d3eca0e6dd9199cd627518cb5ec06add0de9d32baeee6fe645d"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
