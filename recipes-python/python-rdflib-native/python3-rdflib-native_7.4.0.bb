SUMMARY = "RDFLib is a Python library for working with RDF"
HOMEPAGE = "https://github.com/RDFLib/rdflib"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37d489c0cefe52a17e1d5007e196464a"

DEPENDS += "\
             python3-html5lib-native \
             python3-isodate-native \
             python3-pyparsing-native \
           "

PYPI_PACKAGE = "rdflib"

SRC_URI[md5sum] = "24da72d5dbf0ac2e6db366c9d90ae60b"
SRC_URI[sha256sum] = "c8ee16c31848c19c174aed96185327ea139ca3d392fac7fa882ddf5687f8f533"

inherit pypi
inherit python_poetry_core
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-html5lib \
    nativesdk-python3-isodate \
    nativesdk-python3-pyparsing \
"
