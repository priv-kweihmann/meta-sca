SUMMARY = "A plugin for Flake8 finding likely bugs and design problems in your program"
HOMEPAGE = "https://github.com/PyCQA/flake8-bugbear"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d511f8e447826b7e5b61da03a3f5e82b"

DEPENDS += "\
            python3-attrs-native \
            python3-flake8-native \
            "

PYPI_PACKAGE = "flake8-bugbear"

SRC_URI[md5sum] = "14eb1a03d9e5b52fd09eade23d67248a"
SRC_URI[sha256sum] = "46273cef0a6b6ff48ca2d69e472f41420a42a46e24b2a8972e4f0d6733d12a64"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-attrs \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
