SUMMARY = "Merge a series of JSON documents"
HOMEPAGE = "https://github.com/avian2/jsonmerge"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0b1debcb9e8a791ff69fb3d931cba8bf"

DEPENDS += "nativesdk-python3-jsonschema"

PYPI_PACKAGE = "jsonmerge"

SRC_URI[md5sum] = "14ee150c8dafdd770fcf531073a19b7f"
SRC_URI[sha256sum] = "99c04b4b3c5882d5fb3a0a2578a4a720fc913b640cde7df9ae52b33898bb687d"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-jsonschema"
