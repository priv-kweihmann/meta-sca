SUMMARY = "Code coverage measurement for Python"
HOMEPAGE = "https://github.com/nedbat/coveragepy"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

SRC_URI[md5sum] = "506e30fb011158abe5ce92f39866b271"
SRC_URI[sha256sum] = "f90bfc4ad18450c80b024036eaf91e4a246ae287701aaa88eaebebf150868052"

inherit pypi
inherit native
inherit setuptools3
