SUMMARY = "Simple, fast, extensible JSON encoder/decoder for Python"
HOMEPAGE = "https://github.com/simplejson/simplejson"

LICENSE = "MIT & AFL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c6338d7abd321c0b50a2a547e441c52e"

PYPI_PACKAGE = "simplejson"

SRC_URI[md5sum] = "0237f990f00ee41f590e65258617f527"
SRC_URI[sha256sum] = "2af85e028714c4b6cb2eb6fc03aa91f39ffd654f2eb2f6f8f860e14aeefa6be1"

inherit pypi
inherit setuptools3
inherit native
