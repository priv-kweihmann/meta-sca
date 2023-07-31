SUMMARY = "Merge a series of JSON documents"
HOMEPAGE = "https://github.com/avian2/jsonmerge"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d26b79702d8fc46d62b2c0406fc8a909"

DEPENDS += "python3-jsonschema-native"

PYPI_PACKAGE = "jsonmerge"

SRC_URI[md5sum] = "f4b9c8f6889d226ea7acfd91b3ba1c4c"
SRC_URI[sha256sum] = "c43757e0180b0e19b7ae4c130ad42a07cc580c31912f61f4823e8eaf2fa394a3"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-jsonschema"
