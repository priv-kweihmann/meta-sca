SUMMARY = "PyYAML is a YAML parser and emitter for Python"
HOMEPAGE = "https://pyyaml.org"

DEPENDS += "libyaml-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6d8242660a8371add5fe547adf083079"

PYPI_PACKAGE = "PyYAML"

SRC_URI[sha256sum] = "68fb519c14306fec9720a2a5b45bc9f0c8d1b9c72adf45c37baedfcd949c35a2"

inherit pypi
inherit setuptools3
inherit native
