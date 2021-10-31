SUMMARY = "Code coverage measurement for Python"
HOMEPAGE = "https://github.com/nedbat/coveragepy"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

SRC_URI[md5sum] = "ea8d447fb70defe27de5c9158f85c9aa"
SRC_URI[sha256sum] = "b8e4f15b672c9156c1154249a9c5746e86ac9ae9edc3799ee3afebc323d9d9e0"

inherit pypi
inherit setuptools3
inherit native
