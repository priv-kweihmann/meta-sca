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

SRC_URI[md5sum] = "c30c61001edf1fefd25b29308dcb170c"
SRC_URI[sha256sum] = "758b3ab345aa86e95f642713612a57da7c7da6d552c4dbfbe397a67601ace7dd"

inherit pypi
inherit setuptools3
inherit native
