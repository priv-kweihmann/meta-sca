SUMMARY = "Merge a series of JSON documents"
HOMEPAGE = "https://github.com/avian2/jsonmerge"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0b1debcb9e8a791ff69fb3d931cba8bf"

DEPENDS += "nativesdk-python3-jsonschema"

PYPI_PACKAGE = "jsonmerge"

SRC_URI[md5sum] = "c4fc601d805a31a16df6bdba74cd7dec"
SRC_URI[sha256sum] = "a2d1f80021c5c1d70a49e31f862b5f068f9db066080d8561e80654de74a3584d"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-jsonschema"
