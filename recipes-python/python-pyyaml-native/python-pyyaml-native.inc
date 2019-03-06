SUMMARY = "PyYAML is a YAML parser and emitter for Python."
DESCRIPTION = "PyYAML is a YAML parser and emitter for Python."
HOMEPAGE = "https://pyyaml.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5591701d32590f9fa94f3bfee820b634"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "PyYAML"

inherit pypi

FILES_${PN} += "${datadir}/PyYAML"

inherit native
