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

SRC_URI[md5sum] = "64ed1b0548fcd6ad1deb281f4f76671d"
SRC_URI[sha256sum] = "7afa65db14d759616ab68033e0e1caf1f624c97308dd256afa47518ecebddf6e"

inherit pypi
inherit setuptools3
inherit native
