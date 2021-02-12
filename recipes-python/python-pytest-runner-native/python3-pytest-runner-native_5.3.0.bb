SUMMARY = "Invoke py.test as distutils command with dependency resolution"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
            python3-py-native \
            python3-setuptools-native \
            python3-setuptools-scm-native \
           "

SRC_URI[md5sum] = "6b8600f5acb2d13020156f678aabeb47"
SRC_URI[sha256sum] = "ca3f58ff4957e8be6c54c55d575b235725cbbcf4dc0d5091c29c6444cfc8a5fe"

PYPI_PACKAGE = "pytest-runner"

inherit pypi
inherit setuptools3
inherit native
