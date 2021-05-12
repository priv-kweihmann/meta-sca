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

SRC_URI[md5sum] = "2bcae89db1349681ddbc673eb17f7cbf"
SRC_URI[sha256sum] = "188c3cbd7518472217bb7a4d60da6f7fd06c7c9e81f608b5973129a8916a81d4"

inherit pypi
inherit setuptools3
inherit native
