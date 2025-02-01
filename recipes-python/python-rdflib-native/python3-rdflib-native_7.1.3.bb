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

SRC_URI[md5sum] = "0d140c37fc940bbb0b7c94cf50b2ba9b"
SRC_URI[sha256sum] = "f3dcb4c106a8cd9e060d92f43d593d09ebc3d07adc244f4c7315856a12e383ee"

inherit pypi
inherit python_poetry_core
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-html5lib \
    nativesdk-python3-isodate \
    nativesdk-python3-pyparsing \
"
