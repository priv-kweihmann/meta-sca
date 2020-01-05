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
inherit setuptools3

SRC_URI[md5sum] = "71a8eb2ab5efb76512d9a69bd6477034"
SRC_URI[sha256sum] = "6b571215b5a790f9b41f19f3531c53a45cf6bb8ef2988bc1ff9afb38270b25fa"
