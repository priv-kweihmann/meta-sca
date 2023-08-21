SUMMARY = "library that helps with the generation of fingerprints for entity data"
HOMEPAGE = "http://github.com/alephdata/fingerprints"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0787dc3f3a14eb8a7efcfd20cf123c6c"

DEPENDS += "python3-normality-native"

PYPI_PACKAGE = "fingerprints"

SRC_URI[md5sum] = "01b5fefcdcd14a3ba68e536d3035038d"
SRC_URI[sha256sum] = "ba33333de2a801c279029ed10f0ac1abeb3734d652e432a8a7787da077165dca"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-normality"
