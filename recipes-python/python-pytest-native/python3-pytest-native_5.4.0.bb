SUMMARY = "The pytest framework makes it easy to write small tests, yet scales to support complex functional testing"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81eb9f71d006c6b268cf4388e3c98f7b"

PYPI_PACKAGE = "pytest"

DEPENDS += " \
            ${PYTHON_PN}-atomicwrites-native \
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-colorama-native \
            ${PYTHON_PN}-importlib-metadata-native \
            ${PYTHON_PN}-more-itertools-native \
            ${PYTHON_PN}-packaging-native \
            ${PYTHON_PN}-pathlib2-native \
            ${PYTHON_PN}-pluggy-native \
            ${PYTHON_PN}-py-native \
            ${PYTHON_PN}-wcwidth-native \
           "

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "d87062079137b997779c7bb885691948"
SRC_URI[sha256sum] = "76418969e4b9db462a393f1baa13eeb39ba32eccf6013657f4f8295baa234842"
