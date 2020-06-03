SUMMARY = "Python library that measures the width of unicode strings rendered to a terminal"
HOMEPAGE = "https://github.com/jquast/wcwidth"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b15979c39a2543892fca8cd86b4b52cb"

PYPI_PACKAGE = "wcwidth"

SRC_URI[md5sum] = "a1db7aef2af050a3e433373dbac45d95"
SRC_URI[sha256sum] = "edbc2b718b4db6cdf393eefe3a420183947d6aa312505ce6754516f458ff8830"

inherit pypi
inherit native
inherit setuptools3
