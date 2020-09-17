SUMMARY = "Code coverage measurement for Python"
HOMEPAGE = "https://github.com/nedbat/coveragepy"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

SRC_URI[md5sum] = "c2faf2ccc498ce16fd48cc9201c520d7"
SRC_URI[sha256sum] = "280baa8ec489c4f542f8940f9c4c2181f0306a8ee1a54eceba071a449fb870a0"

inherit pypi
inherit native
inherit setuptools3
