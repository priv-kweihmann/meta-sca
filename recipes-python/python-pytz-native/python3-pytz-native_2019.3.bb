SUMMARY = "World timezone definitions, modern and historical"
DESCRIPTION = "World timezone definitions, modern and historical"
HOMEPAGE = "https://pythonhosted.org/pytz/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4878a915709225bceab739bdc2a18e8d"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "pytz"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "c3d84a465fc56a4edd52cca8873ac0df"
SRC_URI[sha256sum] = "b02c06db6cf09c12dd25137e563b31700d3b80fcc4ad23abb7a315f2789819be"
