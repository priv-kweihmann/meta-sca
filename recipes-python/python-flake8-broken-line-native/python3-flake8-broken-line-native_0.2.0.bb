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

SRC_URI[md5sum] = "fdb2f8b90ed1d9c5586f1dc9516fb50e"
SRC_URI[sha256sum] = "550d217ebcdb1d3febc3a7dd5962b2deb4f809a5b0f10b7632b416c4877d2760"
