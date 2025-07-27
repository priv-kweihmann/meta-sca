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

SRC_URI[sha256sum] = "062d6943699b09bce40f727f0d0906a0b254ca455593f81745bb1a352535ee77"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native
