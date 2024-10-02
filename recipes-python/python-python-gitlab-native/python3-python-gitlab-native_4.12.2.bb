SUMMARY = "Interact with GitLab API"
HOMEPAGE = "https://github.com/python-gitlab/python-gitlab"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
            python3-requests-native \
            python3-requests-toolbelt-native \
           "

PYPI_PACKAGE = "python_gitlab"

SRC_URI[sha256sum] = "8c140a2603ad8eff7fcab6f3faabf5fc8baaba8def125eb309a32d6aa3a23a56"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
