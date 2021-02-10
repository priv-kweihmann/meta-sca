SUMMARY = "Simple, fast, extensible JSON encoder/decoder for Python"
HOMEPAGE = "https://github.com/simplejson/simplejson"

LICENSE = "MIT & AFL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c6338d7abd321c0b50a2a547e441c52e"

PYPI_PACKAGE = "simplejson"

SRC_URI[md5sum] = "27fba3bc75a32318bd3b163b8a31aa7e"
SRC_URI[sha256sum] = "75ecc79f26d99222a084fbdd1ce5aad3ac3a8bd535cd9059528452da38b68841"

inherit pypi
inherit setuptools3
inherit native
