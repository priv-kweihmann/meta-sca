SUMMARY = "Code coverage measurement for Python"
HOMEPAGE = "https://github.com/nedbat/coveragepy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

SRC_URI[md5sum] = "aef6a0e35252a53e66a56b440b926874"
SRC_URI[sha256sum] = "987a84ff98a309994ca77ed3cc4b92424f824278e48e4bf7d1bb79a63cfe2099"

inherit pypi
inherit setuptools3
inherit native
