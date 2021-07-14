SUMMARY = "Simple, fast, extensible JSON encoder/decoder for Python"
HOMEPAGE = "https://github.com/simplejson/simplejson"

LICENSE = "MIT & AFL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c6338d7abd321c0b50a2a547e441c52e"

PYPI_PACKAGE = "simplejson"

SRC_URI[md5sum] = "1dd5baacc5609ecb5a96ade67a6a8027"
SRC_URI[sha256sum] = "da72a452bcf4349fc467a12b54ab0e63e654a571cacc44084826d52bde12b6ee"

inherit pypi
inherit setuptools3
inherit native
