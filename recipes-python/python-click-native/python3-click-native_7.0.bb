SUMMARY = "Python composable command line interface toolkit"
DESCRIPTION = "Python composable command line interface toolkit"
HOMEPAGE = "https://github.com/pallets/click"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=c13ed890b210a882c1778216694c98c7"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "Click"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "7f53d50f7b7373ebc7963f9ff697450a"
SRC_URI[sha256sum] = "5b94b49521f6456670fdb30cd82a4eca9412788a93fa6dd6df72c94d5a8ff2d7"
