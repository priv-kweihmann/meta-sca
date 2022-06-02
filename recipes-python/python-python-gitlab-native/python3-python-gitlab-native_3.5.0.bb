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

SRC_URI[md5sum] = "c66b7c8327093b68c2959e76e34da23c"
SRC_URI[sha256sum] = "29ae7fb9b8c9aeb2e6e19bd2fd04867e93ecd7af719978ce68fac0cf116ab30d"

inherit pypi
inherit setuptools3
inherit native
