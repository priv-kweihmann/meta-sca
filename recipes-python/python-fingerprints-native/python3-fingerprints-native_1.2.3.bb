SUMMARY = "library that helps with the generation of fingerprints for entity data"
HOMEPAGE = "http://github.com/alephdata/fingerprints"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0787dc3f3a14eb8a7efcfd20cf123c6c"

DEPENDS += "python3-normality-native"

PYPI_PACKAGE = "fingerprints"

SRC_URI[md5sum] = "fe48d853531d972371d9e1bb1879182d"
SRC_URI[sha256sum] = "1719f808ec8dd6c7b32c79129be3cc77dc2d2258008cd0236654862a86a78b97"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-normality"
