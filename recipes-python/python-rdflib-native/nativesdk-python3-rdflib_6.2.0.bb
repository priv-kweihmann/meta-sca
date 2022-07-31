SUMMARY = "RDFLib is a Python library for working with RDF"
HOMEPAGE = "https://github.com/RDFLib/rdflib"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bcae79bd3c84b857f42a98a7ccf6ad47"

DEPENDS += "\
    nativesdk-python3-html5lib \
    nativesdk-python3-isodate \
    nativesdk-python3-pyparsing \
"

PYPI_PACKAGE = "rdflib"

SRC_URI[md5sum] = "1c1cc2ba4a03d21cb65a64ad97d75b19"
SRC_URI[sha256sum] = "62dc3c86d1712db0f55785baf8047f63731fa59b2682be03219cb89262065942"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-html5lib \
    nativesdk-python3-isodate \
    nativesdk-python3-pyparsing \
"
