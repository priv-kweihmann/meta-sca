SUMMARY = "Internationalized Domain Names for Python"
HOMEPAGE = "https://github.com/kjd/idna"

LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=cf36c8682cc154d2d4aa57bd6246b9a1"

PYPI_PACKAGE = "idna"

SRC_URI[md5sum] = "7a910c706db30d758f377db2762c0f9a"
SRC_URI[sha256sum] = "b307872f855b18632ce0c21c5e45be78c0ea7ae4c15c828c20788b26921eb3f6"

inherit pypi
inherit native
inherit setuptools3
