SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=01831ddbaf398471da3cc87f5037e822"

PYPI_PACKAGE = "pycodestyle"

SRC_URI[md5sum] = "40e7a76f364a18f531aaba11a4476e21"
SRC_URI[sha256sum] = "e40a936c9a450ad81df37f549d676d127b1b66000a6c500caa2b085bc0ca976c"

inherit pypi
inherit native
inherit setuptools3
