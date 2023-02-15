SUMMARY = "library that helps with the generation of fingerprints for entity data"
HOMEPAGE = "http://github.com/alephdata/fingerprints"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0787dc3f3a14eb8a7efcfd20cf123c6c"

DEPENDS += "python3-normality-native"

PYPI_PACKAGE = "fingerprints"

SRC_URI[md5sum] = "3bafe45ba7ae4439847e005a75f9d19c"
SRC_URI[sha256sum] = "1999aeae0deba43d3cd50656fcb50a59b961b104124ba960f4eef2fe41b2e13a"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-normality"
