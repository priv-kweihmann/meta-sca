SUMMARY = "World timezone definitions, modern and historical"
DESCRIPTION = "World timezone definitions, modern and historical"
HOMEPAGE = "https://pythonhosted.org/pytz/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4878a915709225bceab739bdc2a18e8d"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "pytz"

inherit pypi
inherit native
