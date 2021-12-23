SUMMARY = "Easy to write small tests"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support complex functional testing"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81eb9f71d006c6b268cf4388e3c98f7b"

DEPENDS += "\
            python3-atomicwrites-native \
            python3-attrs-native \
            python3-colorama-native \
            python3-importlib-metadata-native \
            python3-more-itertools-native \
            python3-packaging-native \
            python3-pathlib2-native \
            python3-pluggy-native \
            python3-py-native \
            python3-wcwidth-native \
           "

PYPI_PACKAGE = "pytest"

SRC_URI[md5sum] = "8bc467ebd5d571778dc51dd87ff09513"
SRC_URI[sha256sum] = "131b36680866a76e6781d13f101efb86cf674ebb9762eb70d3082b6f29889e89"


inherit pypi
inherit setuptools3
inherit native
