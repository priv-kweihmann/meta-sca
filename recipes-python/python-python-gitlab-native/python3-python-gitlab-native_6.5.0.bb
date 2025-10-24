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

SRC_URI[sha256sum] = "97553652d94b02de343e9ca92782239aa2b5f6594c5482331a9490d9d5e8737d"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native
