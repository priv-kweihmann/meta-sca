SUMMARY = "Code coverage measurement for Python"

HOMEPAGE = "https://github.com/nedbat/coveragepy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "ccc1dca92f630eff18e7a94a8d63c11e"
SRC_URI[sha256sum] = "77afca04240c40450c331fa796b3eab6f1e15c5ecf8bf2b8bee9706cd5452fef"
