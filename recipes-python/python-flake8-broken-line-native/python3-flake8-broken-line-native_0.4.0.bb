SUMMARY = "Flake8 plugin to forbid backslashes (\) for line breaks"
HOMEPAGE = "https://github.com/sobolevn/flake8-broken-line"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=268c5fd9e64a788932af10a988ab35c4"

DEPENDS += "\
            python3-bandit-native \
            python3-flake8-native \
            python3-flake8-polyfill-native \
            python3-pycodestyle-native \
            "

PYPI_PACKAGE = "flake8-broken-line"

SRC_URI[md5sum] = "0f6a4b83ae91cede2a6b42b1d6041582"
SRC_URI[sha256sum] = "771aab5aa0997666796fed249d0e48e6c01cdfeca8c95521eea28a38b7ced4c7"

inherit pypi
inherit setuptools3
inherit native
