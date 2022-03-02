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

SRC_URI[md5sum] = "5f40a028b5a5c65192e8a74439b1591d"
SRC_URI[sha256sum] = "8f6ee81109fec231fc2b74e2c4035bb7de0548eaf82dd119fe294df2c4a524be"

inherit pypi
inherit setuptools3
inherit native
