SUMMARY = "World timezone definitions, modern and historical"
HOMEPAGE = "https://pythonhosted.org/pytz/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1a67fc46c1b596cce5d21209bbe75999"

PYPI_PACKAGE = "pytz"

SRC_URI[md5sum] = "2223910fe2e463a01c3102a21acf4f8d"
SRC_URI[sha256sum] = "1e760e2fe6a8163bc0b3d9a19c4f84342afa0a2affebfaa84b01b978a02ecaa7"

inherit pypi
inherit setuptools3
inherit native
