SUMMARY = "PyYAML is a YAML parser and emitter for Python."
DESCRIPTION = "PyYAML is a YAML parser and emitter for Python."
HOMEPAGE = "https://pyyaml.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5591701d32590f9fa94f3bfee820b634"

PV = "3.13"

SRC_URI[md5sum] = "b78b96636d68ac581c0e2f38158c224f"
SRC_URI[sha256sum] = "3ef3092145e9b70e3ddd2c7ad59bdd0252a94dfe3949721633e41344de00a6bf"

DEPENDS += "python3-native"

PYPI_PACKAGE = "PyYAML"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/PyYAML"

BBCLASSEXTEND = "native nativesdk"
