SUMMARY = "Simple, fast, extensible JSON encoder/decoder for Python"
HOMEPAGE = "https://github.com/simplejson/simplejson"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT & AFL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c6338d7abd321c0b50a2a547e441c52e"

PYPI_PACKAGE = "simplejson"

SRC_URI[md5sum] = "ecd07fca7a7fa0bcc9acdf9d82e41eb1"
SRC_URI[sha256sum] = "746086e3ef6d74b53599df31b491d88a355abf2e31c837137dd90f8c4561cafa"

inherit pypi
inherit setuptools3
inherit native
