# Import from oe-core, after upstream removal
SUMMARY = "World timezone definitions, modern and historical"
HOMEPAGE = "http://pythonhosted.org/pytz"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1a67fc46c1b596cce5d21209bbe75999"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
inherit pypi
inherit setuptools3
inherit native

SRC_URI[sha256sum] = "10413c35476919b4c07bda6b9810c6e24d914378c430070bdb1869e18a37eee5"
