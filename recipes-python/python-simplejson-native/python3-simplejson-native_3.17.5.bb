SUMMARY = "Simple, fast, extensible JSON encoder/decoder for Python"
HOMEPAGE = "https://github.com/simplejson/simplejson"

LICENSE = "MIT & AFL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c6338d7abd321c0b50a2a547e441c52e"

PYPI_PACKAGE = "simplejson"

SRC_URI[md5sum] = "1756427859454004e90e028d263cf23e"
SRC_URI[sha256sum] = "91cfb43fb91ff6d1e4258be04eee84b51a4ef40a28d899679b9ea2556322fb50"

inherit pypi
inherit setuptools3
inherit native
