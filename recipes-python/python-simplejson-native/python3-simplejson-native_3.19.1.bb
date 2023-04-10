SUMMARY = "Simple, fast, extensible JSON encoder/decoder for Python"
HOMEPAGE = "https://github.com/simplejson/simplejson"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT & AFL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c6338d7abd321c0b50a2a547e441c52e"

PYPI_PACKAGE = "simplejson"

SRC_URI[md5sum] = "c1ba771b261839ba2df44ad80c29640a"
SRC_URI[sha256sum] = "6277f60848a7d8319d27d2be767a7546bc965535b28070e310b3a9af90604a4c"

inherit pypi
inherit setuptools3
inherit native
