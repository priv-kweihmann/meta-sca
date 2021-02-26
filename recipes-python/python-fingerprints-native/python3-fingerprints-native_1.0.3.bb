SUMMARY = "library that helps with the generation of fingerprints for entity data"
HOMEPAGE = "http://github.com/alephdata/fingerprints"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0787dc3f3a14eb8a7efcfd20cf123c6c"

DEPENDS += "python3-normality-native"

PYPI_PACKAGE = "fingerprints"

SRC_URI[md5sum] = "0a4c56542198a851f10b831a41bd2113"
SRC_URI[sha256sum] = "cafd5f92b5b91e4ce34af2b954da9c05b448a4778947785abb19a14f363352d0"

inherit pypi
inherit setuptools3
inherit native
