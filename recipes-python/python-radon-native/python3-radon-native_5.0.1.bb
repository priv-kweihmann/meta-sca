SUMMARY = "Various code metrics for Python code"
HOMEPAGE = "https://github.com/rubik/radon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4540bac589ba237d0f9238a399607ca"

DEPENDS += "\
            python3-colorama-native \
            python3-flake8-polyfill-native \
            python3-future-native \
            python3-mando-native \
           "

PYPI_PACKAGE = "radon"

SRC_URI[md5sum] = "9c982494a12ae36727296dbc6dd21cfa"
SRC_URI[sha256sum] = "9d6637fb026d63e7a3a65539976461f81a6d4e2b20c420615d0ce4cff73614a7"

inherit pypi
inherit setuptools3
inherit native
