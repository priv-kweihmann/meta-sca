SUMMARY = "Invoke py.test as distutils command with dependency resolution"
HOMEPAGE = "https://github.com/pytest-dev/pytest-runner/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
            python3-py-native \
            python3-setuptools-native \
            python3-setuptools-scm-native \
           "

SRC_URI[md5sum] = "74f14ba3b07bb7ef96da4108f3f2921b"
SRC_URI[sha256sum] = "b4d85362ed29b4c348678de797df438f0f0509497ddb8c647096c02a6d87b685"

PYPI_PACKAGE = "pytest-runner"

inherit pypi
inherit setuptools_build_meta
inherit native
