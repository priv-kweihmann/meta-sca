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

SRC_URI[md5sum] = "6fdc30dfaef1cd5d756c58c61c5c4d48"
SRC_URI[sha256sum] = "901c54ff926f10479cb591a34d65f0a3022f2bcc41074f9a192c7fa7e4c57061"

inherit pypi
inherit setuptools3
inherit native
