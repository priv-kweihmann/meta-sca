SUMMARY = "RDFLib is a Python library for working with RDF"
HOMEPAGE = "https://github.com/RDFLib/rdflib"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b6cde159c801514e0e45a40cf0a9d3d9"

DEPENDS += "\
             python3-html5lib-native \
             python3-isodate-native \
             python3-pyparsing-native \
           "

PYPI_PACKAGE = "rdflib"

SRC_URI[md5sum] = "a6a72e42d6df50dab85f6bfd101664fe"
SRC_URI[sha256sum] = "f071caff0b68634e4a7bd1d66ea3416ac98f1cc3b915938147ea899c32608728"

inherit pypi
inherit setuptools3
inherit native
