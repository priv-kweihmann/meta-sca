SUMMARY = "Flake8 plugin to forbid backslashes (\) for line breaks"

HOMEPAGE = "https://github.com/sobolevn/flake8-broken-line"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=268c5fd9e64a788932af10a988ab35c4"

PYPI_PACKAGE = "flake8-broken-line"

DEPENDS += " \  
            ${PYTHON_PN}-bandit-native \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-flake8-polyfill-native \
            ${PYTHON_PN}-pycodestyle-native \
            "

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "2d326b4b81173c6d5b0373ed9c2a26ad"
SRC_URI[sha256sum] = "30378a3749911e453d0a9e03204156cbbd35bcc03fb89f12e6a5206e5baf3537"
