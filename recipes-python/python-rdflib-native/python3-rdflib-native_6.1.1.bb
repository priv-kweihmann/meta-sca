SUMMARY = "RDFLib is a Python library for working with RDF"
HOMEPAGE = "https://github.com/RDFLib/rdflib"

DEFAULT_PREFERENCE = "-1"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b6cde159c801514e0e45a40cf0a9d3d9"

DEPENDS += "\
             python3-html5lib-native \
             python3-isodate-native \
             python3-pyparsing-native \
           "

PYPI_PACKAGE = "rdflib"

SRC_URI[md5sum] = "fc52892325b2ee7aa404a8bd5c669870"
SRC_URI[sha256sum] = "8dbfa0af2990b98471dacbc936d6494c997ede92fd8ed693fb84ee700ef6f754"

inherit pypi
inherit setuptools3
inherit native
