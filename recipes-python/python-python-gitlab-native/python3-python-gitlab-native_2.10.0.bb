SUMMARY = "Interact with GitLab API"
HOMEPAGE = "https://github.com/python-gitlab/python-gitlab"

LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
            python3-requests-native \
            python3-requests-toolbelt-native \
           "

PYPI_PACKAGE = "python-gitlab"

SRC_URI[md5sum] = "15130f8b792e6c0b8cc4c449d158c48d"
SRC_URI[sha256sum] = "376b3e982381cec734471c502b3da2c6e7858a8df4d03c993499e6a7593950e6"

inherit pypi
inherit setuptools3
inherit native
