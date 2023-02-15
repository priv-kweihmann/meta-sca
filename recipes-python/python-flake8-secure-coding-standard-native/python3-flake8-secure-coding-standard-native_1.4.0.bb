SUMMARY = "flake8 plugin that enforces some secure coding standards"
HOMEPAGE = "https://github.com/Takishima/flake8-secure-coding-standard"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e169d4822588f9ef58a60bae3e9785f2"

DEPENDS += "\
    python3-flake8-native \
    python3-setuptools-scm-native \
    python3-wheel-native \
"

PYPI_PACKAGE = "flake8-secure-coding-standard"

SRC_URI[sha256sum] = "a0393cd3ed5bd44a79735e15d1845e9416cda5b3fe39941984e2d9714916d779"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
