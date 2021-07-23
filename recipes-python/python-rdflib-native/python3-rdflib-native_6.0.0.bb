SUMMARY = "RDFLib is a Python library for working with RDF"
HOMEPAGE = "https://github.com/RDFLib/rdflib"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=89aa9a14f80a6ac70e1d5da763a309ed"

DEPENDS += "\
             python3-html5lib-native \
             python3-isodate-native \
             python3-pyparsing-native \
           "

PYPI_PACKAGE = "rdflib"

SRC_URI[md5sum] = "d539085e793601e93047e5715e0c1c3f"
SRC_URI[sha256sum] = "7ce4d757eb26f4dd43205ec340d8c097f29e5adfe45d6ea20238c731dc679879"

inherit pypi
inherit setuptools3
inherit native
