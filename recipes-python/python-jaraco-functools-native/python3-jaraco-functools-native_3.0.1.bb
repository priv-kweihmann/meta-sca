SUMMARY = "Additional functools in the spirit of stdlib’s functools"
HOMEPAGE = "https://github.com/jaraco/jaraco.functools"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
            python3-more-itertools-native \
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "jaraco.functools"

SRC_URI[md5sum] = "03071cdfd6c24dcb14793d09d31a0478"
SRC_URI[sha256sum] = "9fedc4be3117512ca3e03e1b2ffa7a6a6ffa589bfb7d02bfb324e55d493b94f4"

inherit pypi
inherit native
inherit setuptools3
