SUMMARY = "the modular source code checker: pep8, pyflakes and co"
HOMEPAGE = "https://gitlab.com/pycqa/flake8"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=75b26781f1adf1aa310bda6098937878"

DEPENDS += "\
            python3-mccabe-native \
            python3-pycodestyle-native \
            python3-pyflakes-native \
            "

PYPI_PACKAGE = "flake8"

SRC_URI[md5sum] = "5b0c69330b5cbdf639a33c91b896f7b1"
SRC_URI[sha256sum] = "fa558ae3f6f7dbf2b4f22663e5343b6b6023620461f8d4ff2019ef4b5ee70426"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-json \
    nativesdk-python3-logging \
    nativesdk-python3-mccabe \
    nativesdk-python3-pycodestyle \
    nativesdk-python3-pyflakes \
"
