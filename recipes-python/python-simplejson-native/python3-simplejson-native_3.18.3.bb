SUMMARY = "Simple, fast, extensible JSON encoder/decoder for Python"
HOMEPAGE = "https://github.com/simplejson/simplejson"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT & AFL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c6338d7abd321c0b50a2a547e441c52e"

PYPI_PACKAGE = "simplejson"

SRC_URI[md5sum] = "636aef44f002e55be96a88faa84503d0"
SRC_URI[sha256sum] = "ebb53837c5ffcb6100646018565d3f1afed6f4b185b14b2c9cbccf874fe40157"

inherit pypi
inherit setuptools3
inherit native
