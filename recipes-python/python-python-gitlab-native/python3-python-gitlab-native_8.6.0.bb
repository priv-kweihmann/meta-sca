SUMMARY = "Interact with GitLab API"
HOMEPAGE = "https://github.com/python-gitlab/python-gitlab"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=b70895b5c1db69fe9503d38b20b5b91b"

DEPENDS += "\
            python3-requests-native \
            python3-requests-toolbelt-native \
           "

PYPI_PACKAGE = "python-gitlab"

SRC_URI[sha256sum] = "d1602164fb58ab280ceef460faf015cec6e7d83bb2d9cbae44ba448adb5568ef"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native
