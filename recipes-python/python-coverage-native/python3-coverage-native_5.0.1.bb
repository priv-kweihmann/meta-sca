SUMMARY = "Code coverage measurement for Python"

HOMEPAGE = "https://github.com/nedbat/coveragepy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "bf37d744790777bce275b6160d32048c"
SRC_URI[sha256sum] = "5ac71bba1e07eab403b082c4428f868c1c9e26a21041436b4905c4c3d4e49b08"
