SUMMARY = "Code coverage measurement for Python"
HOMEPAGE = "https://github.com/nedbat/coveragepy"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

SRC_URI[md5sum] = "8885b8ed8e80b0af238959af3bb3dc80"
SRC_URI[sha256sum] = "6807947a09510dc31fa86f43595bf3a14017cd60bf633cc746d52141bfa6b149"

inherit pypi
inherit setuptools3
inherit native
