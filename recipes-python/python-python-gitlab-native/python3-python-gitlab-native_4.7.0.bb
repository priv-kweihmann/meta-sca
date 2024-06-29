SUMMARY = "Interact with GitLab API"
HOMEPAGE = "https://github.com/python-gitlab/python-gitlab"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
            python3-requests-native \
            python3-requests-toolbelt-native \
           "

PYPI_PACKAGE = "python_gitlab"

SRC_URI[sha256sum] = "b798cddbd9d166b79571e6d6c97542978d0a395de57169c7097d09210a766a6d"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
