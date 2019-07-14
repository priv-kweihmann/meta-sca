SUMMARY = "The pytest framework makes it easy to write small tests, yet scales to support complex functional testing"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=640061b8cee64b308a4d2f9f556c12f2"

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
