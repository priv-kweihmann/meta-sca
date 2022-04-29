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

SRC_URI[md5sum] = "ed90efc89754bf9a661f0d8ff2729639"
SRC_URI[sha256sum] = "6180b81ee2f265ad8d8412956a1740b4d3ceca7b28ae2f707dfe62375fed0082"

inherit pypi
inherit setuptools3
inherit native
