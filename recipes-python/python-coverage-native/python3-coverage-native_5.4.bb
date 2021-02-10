SUMMARY = "Code coverage measurement for Python"
HOMEPAGE = "https://github.com/nedbat/coveragepy"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

SRC_URI[md5sum] = "150f74c0cd9b2243df78dcbc4cbc9378"
SRC_URI[sha256sum] = "6d2e262e5e8da6fa56e774fb8e2643417351427604c2b177f8e8c5f75fc928ca"

inherit pypi
inherit setuptools3
inherit native
