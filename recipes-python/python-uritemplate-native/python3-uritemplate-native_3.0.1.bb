SUMMARY = "URI templates"
HOMEPAGE = "https://github.com/python-hyper/uritemplate"

LICENSE = "Apache-2.0 | BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://LICENSE.APACHE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE.BSD;md5=d51d83fdbd6608d10a71666840ef5d15 \
"

PYPI_PACKAGE = "uritemplate"

SRC_URI[md5sum] = "869fb44fbd56713490db7272eb36c8ae"
SRC_URI[sha256sum] = "5af8ad10cec94f215e3f48112de2022e1d5a37ed427fbd88652fa908f2ab7cae"

inherit pypi
inherit setuptools3
inherit native
