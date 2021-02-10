SUMMARY = "library that helps with the generation of fingerprints for entity data"
HOMEPAGE = "http://github.com/alephdata/fingerprints"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0787dc3f3a14eb8a7efcfd20cf123c6c"

DEPENDS += "python3-normality-native"

PYPI_PACKAGE = "fingerprints"

SRC_URI[md5sum] = "a503dd59707f7d84a23100bf3adcb138"
SRC_URI[sha256sum] = "b180a4868d53c2626b3b14004faaa18a23f0596c1de130676f963bd749153869"

inherit pypi
inherit setuptools3
inherit native
