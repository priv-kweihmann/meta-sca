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

SRC_URI[md5sum] = "40ebf724c179d450d5ac09c459009003"
SRC_URI[sha256sum] = "164de86bd3564558802ca983d84f6616a4a1a420c7a17a8152f5016076b2913e"

inherit pypi
inherit python_poetry_core
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-html5lib \
    nativesdk-python3-isodate \
    nativesdk-python3-pyparsing \
"
