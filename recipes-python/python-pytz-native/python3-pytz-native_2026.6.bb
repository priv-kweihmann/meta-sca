# Import from oe-core, after upstream removal
SUMMARY = "World timezone definitions, modern and historical"
HOMEPAGE = "http://pythonhosted.org/pytz"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1a67fc46c1b596cce5d21209bbe75999"

PYPI_PACKAGE = "pytz"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
inherit pypi
inherit setuptools3
inherit native

SRC_URI[sha256sum] = "3b0fc2727707663d6e517936f444fd8a8b240f1fc32f4bf7ee03274245945284"
