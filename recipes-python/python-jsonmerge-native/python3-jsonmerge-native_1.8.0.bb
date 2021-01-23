SUMMARY = "Merge a series of JSON documents"
HOMEPAGE = "https://github.com/avian2/jsonmerge"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=32ff730f2e4d49a1191f6d7c1d6c8395"

DEPENDS += "python3-jsonschema-native"

PYPI_PACKAGE = "jsonmerge"

SRC_URI[md5sum] = "93d6ad30e7c990642e81f88fdce55389"
SRC_URI[sha256sum] = "a86bfc44f32f6a28b749743df8960a4ce1930666b3b73882513825f845cb9558"

inherit pypi
inherit setuptools3
inherit native
