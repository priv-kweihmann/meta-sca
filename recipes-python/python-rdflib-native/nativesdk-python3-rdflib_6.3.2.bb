SUMMARY = "RDFLib is a Python library for working with RDF"
HOMEPAGE = "https://github.com/RDFLib/rdflib"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37d489c0cefe52a17e1d5007e196464a"

DEPENDS += "\
    nativesdk-python3-html5lib \
    nativesdk-python3-isodate \
    nativesdk-python3-pyparsing \
"

PYPI_PACKAGE = "rdflib"

SRC_URI[md5sum] = "50a7d21f4517dbd57bd2fe2823454eef"
SRC_URI[sha256sum] = "72af591ff704f4caacea7ecc0c5a9056b8553e0489dd4f35a9bc52dbd41522e0"

inherit pypi
inherit python_poetry_core
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-html5lib \
    nativesdk-python3-isodate \
    nativesdk-python3-pyparsing \
"
