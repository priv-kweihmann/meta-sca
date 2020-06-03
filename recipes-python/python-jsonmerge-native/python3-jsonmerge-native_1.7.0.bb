SUMMARY = "Merge a series of JSON documents"
HOMEPAGE = "https://github.com/avian2/jsonmerge"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f05788a9cdd8a4f317971d89ef4c6abb"

DEPENDS += "python3-jsonschema-native"

PYPI_PACKAGE = "jsonmerge"

SRC_URI[md5sum] = "9dc9eb9bf28fb6b42c6370ffcc5c6a76"
SRC_URI[sha256sum] = "2004a421890311176136fb911c339c4bab45984808814feaed6a328c6e211ba2"

inherit pypi
inherit setuptools3
inherit native
