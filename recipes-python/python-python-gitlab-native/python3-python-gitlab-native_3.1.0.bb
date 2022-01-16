SUMMARY = "Interact with GitLab API"
HOMEPAGE = "https://github.com/python-gitlab/python-gitlab"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
            python3-requests-native \
            python3-requests-toolbelt-native \
           "

PYPI_PACKAGE = "python-gitlab"

SRC_URI[md5sum] = "328e1d2bca8ac7a529bb81959ef216d3"
SRC_URI[sha256sum] = "7216c9100b2a17cae5cf53b4b40ee36a7262d4ead7526c5a6278d911eba74847"

inherit pypi
inherit setuptools3
inherit native
