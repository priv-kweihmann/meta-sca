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
