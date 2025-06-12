SUMMARY = "URI templates"
HOMEPAGE = "https://github.com/python-hyper/uritemplate"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0 | BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://LICENSE;md5=0f6d769bdcfacac3c1a1ffa568937fe0 \
    file://LICENSE.APACHE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE.BSD;md5=6b574ed4b26bdce9060017ce052d0109 \
"

PYPI_PACKAGE = "uritemplate"

SRC_URI[md5sum] = "c1b679033e9be398232e75ad9e09e8e8"
SRC_URI[sha256sum] = "480c2ed180878955863323eea31b0ede668795de182617fef9c6ca09e6ec9d0e"

inherit pypi
inherit setuptools3
inherit_defer native
