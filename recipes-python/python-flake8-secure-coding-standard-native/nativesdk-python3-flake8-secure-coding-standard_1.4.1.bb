SUMMARY = "flake8 plugin that enforces some secure coding standards"
HOMEPAGE = "https://github.com/Takishima/flake8-secure-coding-standard"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e169d4822588f9ef58a60bae3e9785f2"

DEPENDS += "\
    nativesdk-python3-flake8 \
    python3-setuptools-scm-native \
    python3-wheel-native \
"

PYPI_PACKAGE = "flake8-secure-coding-standard"

SRC_URI[sha256sum] = "75590fba3af46028a908bad7c11e789b6c1bf78805be54f92229d3c490009bf2"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
