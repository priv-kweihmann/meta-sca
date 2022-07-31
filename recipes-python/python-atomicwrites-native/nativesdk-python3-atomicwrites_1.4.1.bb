SUMMARY = "Powerful Python library for atomic file writes"
HOMEPAGE = "https://github.com/untitaker/python-atomicwrites"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=91cc36cfafeefb7863673bcfcb1d4da4"

PYPI_PACKAGE = "atomicwrites"

SRC_URI[md5sum] = "9ff8e556d0b4a411d0cebbdb3fb0c70d"
SRC_URI[sha256sum] = "81b2c9071a49367a7f770170e5eec8cb66567cfbbc8c73d20ce5ca4a8d71cf11"

inherit pypi
inherit setuptools3
inherit nativesdk
