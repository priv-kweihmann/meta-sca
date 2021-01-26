SUMMARY = "Easy to write small tests"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support complex functional testing"

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

SRC_URI[md5sum] = "828d15f426ce9740627a9b07e47a318a"
SRC_URI[sha256sum] = "9d1edf9e7d0b84d72ea3dbcdfd22b35fb543a5e8f2a60092dd578936bf63d7f9"


inherit pypi
inherit native
inherit setuptools3
