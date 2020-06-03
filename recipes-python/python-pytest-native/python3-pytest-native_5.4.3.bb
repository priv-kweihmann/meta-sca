SUMMARY = "Easy to write small tests"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support complex functional testing"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81eb9f71d006c6b268cf4388e3c98f7b"

DEPENDS += "\
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

PYPI_PACKAGE = "pytest"

SRC_URI[md5sum] = "4b6b06b2818516c7c400d4cafe3b9257"
SRC_URI[sha256sum] = "7979331bfcba207414f5e1263b5a0f8f521d0f457318836a7355531ed1a4c7d8"


inherit pypi
inherit native
inherit setuptools3
