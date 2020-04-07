SUMMARY = "Python library that measures the width of unicode strings rendered to a terminal"
HOMEPAGE = "https://github.com/jquast/wcwidth"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=11fba47286258744a6bc6e43530c32a1"

PYPI_PACKAGE = "wcwidth"

SRC_URI[md5sum] = "b32584cd6084b4a8c81df13a2a6b4351"
SRC_URI[sha256sum] = "ee73862862a156bf77ff92b09034fc4825dd3af9cf81bc5b360668d425f3c5f1"

inherit pypi
inherit native
inherit setuptools3
