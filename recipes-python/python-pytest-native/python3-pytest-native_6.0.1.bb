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

SRC_URI[md5sum] = "c3e7c811b2b74c60bb5fb951229ebce9"
SRC_URI[sha256sum] = "85228d75db9f45e06e57ef9bf4429267f81ac7c0d742cc9ed63d09886a9fe6f4"


inherit pypi
inherit native
inherit setuptools3
