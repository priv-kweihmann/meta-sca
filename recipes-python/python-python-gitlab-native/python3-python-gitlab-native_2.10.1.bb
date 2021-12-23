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

SRC_URI[md5sum] = "f64493bada40fc76fcef8b687da2fd5d"
SRC_URI[sha256sum] = "7afa7d7c062fa62c173190452265a30feefb844428efc58ea5244f3b9fc0d40f"

inherit pypi
inherit setuptools3
inherit native
