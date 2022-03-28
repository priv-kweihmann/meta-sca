SUMMARY = "Interact with GitLab API"
HOMEPAGE = "https://github.com/python-gitlab/python-gitlab"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
            python3-requests-native \
            python3-requests-toolbelt-native \
           "

PYPI_PACKAGE = "python-gitlab"

SRC_URI[md5sum] = "ead7fedcee34c0a361dc50bb884533d0"
SRC_URI[sha256sum] = "fef25d41a62f91da82ee20f72a728b9c69eef34cf0a3005cdbb9a0b471d5b498"

inherit pypi
inherit setuptools3
inherit native
