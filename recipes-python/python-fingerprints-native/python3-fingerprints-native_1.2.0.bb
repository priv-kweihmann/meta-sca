SUMMARY = "library that helps with the generation of fingerprints for entity data"
HOMEPAGE = "http://github.com/alephdata/fingerprints"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0787dc3f3a14eb8a7efcfd20cf123c6c"

DEPENDS += "python3-normality-native"

PYPI_PACKAGE = "fingerprints"

SRC_URI[md5sum] = "ec24a14c653cdfa11fc617f6599fda52"
SRC_URI[sha256sum] = "c2522f66bc98f0afc61282edab65e57e39d8e4ec5dc6b0cf9fe2f1592ac57af3"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-normality"
