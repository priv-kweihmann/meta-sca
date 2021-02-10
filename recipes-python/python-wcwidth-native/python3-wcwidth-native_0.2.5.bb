SUMMARY = "Python library that measures the width of unicode strings rendered to a terminal"
HOMEPAGE = "https://github.com/jquast/wcwidth"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b15979c39a2543892fca8cd86b4b52cb"

PYPI_PACKAGE = "wcwidth"

SRC_URI[md5sum] = "a07a75f99d316e14838ac760c831ea37"
SRC_URI[sha256sum] = "c4d647b99872929fdb7bdcaa4fbe7f01413ed3d98077df798530e5b04f116c83"

inherit pypi
inherit setuptools3
inherit native
