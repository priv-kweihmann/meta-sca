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

SRC_URI[md5sum] = "f87d06b0bcea00279dfdf6cc32bf0fd0"
SRC_URI[sha256sum] = "0fce5b8dc68760f353979d99fdd6b3ad46330b6b1837e2077a89ebcf204aac91"

PYPI_PACKAGE = "pytest-runner"

inherit pypi
inherit setuptools3
inherit native

do_configure:prepend() {
    sed -i "s#name='pytest-runner',#name='pytest-runner',version='${PV}',#g" ${S}/setup.py
}
