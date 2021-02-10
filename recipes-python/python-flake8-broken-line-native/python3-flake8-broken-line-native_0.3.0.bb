SUMMARY = "Flake8 plugin to forbid backslashes (\) for line breaks"
HOMEPAGE = "https://github.com/sobolevn/flake8-broken-line"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=268c5fd9e64a788932af10a988ab35c4"

DEPENDS += "\
            python3-bandit-native \
            python3-flake8-native \
            python3-flake8-polyfill-native \
            python3-pycodestyle-native \
            "

PYPI_PACKAGE = "flake8-broken-line"

SRC_URI[md5sum] = "075939d2756ca63cbb2af541ac1d01ec"
SRC_URI[sha256sum] = "f74e052833324a9e5f0055032f7ccc54b23faabafe5a26241c2f977e70b10b50"

inherit pypi
inherit setuptools3
inherit native
