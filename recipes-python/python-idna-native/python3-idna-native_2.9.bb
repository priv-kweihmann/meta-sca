SUMMARY = "Internationalized Domain Names for Python"
HOMEPAGE = "https://github.com/kjd/idna"

LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=cf36c8682cc154d2d4aa57bd6246b9a1"

PYPI_PACKAGE = "idna"

SRC_URI[md5sum] = "870b8b80267f00f0faf1b7ba4bdbf14e"
SRC_URI[sha256sum] = "7588d1c14ae4c77d74036e8c22ff447b26d0fde8f007354fd48a7814db15b7cb"

inherit pypi
inherit native
inherit setuptools3
