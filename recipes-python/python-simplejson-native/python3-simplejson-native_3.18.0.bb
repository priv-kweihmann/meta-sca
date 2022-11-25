SUMMARY = "Simple, fast, extensible JSON encoder/decoder for Python"
HOMEPAGE = "https://github.com/simplejson/simplejson"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT & AFL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c6338d7abd321c0b50a2a547e441c52e"

PYPI_PACKAGE = "simplejson"

SRC_URI[md5sum] = "83e24e662f024e06af2fffe698227da4"
SRC_URI[sha256sum] = "58a429d2c2fa80834115b923ff689622de8f214cf0dc4afa9f59e824b444ab31"

inherit pypi
inherit setuptools3
inherit native
