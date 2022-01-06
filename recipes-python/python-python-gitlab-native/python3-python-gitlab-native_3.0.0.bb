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

SRC_URI[md5sum] = "51cb2d164491b5bec126c632ef2046d0"
SRC_URI[sha256sum] = "89f82740b76820cf407cee9c43b75ca3ddb72f344f595902ee963837d7664986"

inherit pypi
inherit setuptools3
inherit native
