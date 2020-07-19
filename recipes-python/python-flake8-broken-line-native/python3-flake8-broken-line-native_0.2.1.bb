SUMMARY = "Flake8 plugin to forbid backslashes (\) for line breaks"
HOMEPAGE = "https://github.com/sobolevn/flake8-broken-line"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=268c5fd9e64a788932af10a988ab35c4"

DEPENDS += "\
            ${PYTHON_PN}-bandit-native \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-flake8-polyfill-native \
            ${PYTHON_PN}-pycodestyle-native \
            "

PYPI_PACKAGE = "flake8-broken-line"

SRC_URI[md5sum] = "f1c89d3e0697cbdef01eeb57e2598242"
SRC_URI[sha256sum] = "414477070231a5aa05468d48db2742a594b53fbc1ecba28044646706a11fb861"

inherit pypi
inherit native
inherit setuptools3
