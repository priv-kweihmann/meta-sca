SUMMARY = "Interact with GitLab API"
HOMEPAGE = "https://github.com/python-gitlab/python-gitlab"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
    nativesdk-python3-requests \
    nativesdk-python3-requests-toolbelt \
"

PYPI_PACKAGE = "python-gitlab"

SRC_URI[md5sum] = "93dcff67e3fea8feb77d6bdc103580bf"
SRC_URI[sha256sum] = "db9472b6ae4fba968b409dc32faee20dd65089065daa93e08d21b796a65d6578"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-requests \
    nativesdk-python3-requests-toolbelt \
"
