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

SRC_URI[md5sum] = "b4ffdd18a187a263b9486b27a3576c7e"
SRC_URI[sha256sum] = "ad502b72b5d1137f4af37d4a68ae20fe7d6c9778f67cbe2aec566f7995053c7d"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-requests \
    nativesdk-python3-requests-toolbelt \
"
