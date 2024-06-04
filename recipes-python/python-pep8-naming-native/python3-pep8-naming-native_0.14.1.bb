SUMMARY = "Naming Convention checker for Python"
HOMEPAGE = "https://github.com/PyCQA/pep8-naming"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6aba56fb2ab6893b08fb8daa7eeba461"

DEPENDS += "python3-flake8-polyfill-native"

PYPI_PACKAGE = "pep8-naming"

SRC_URI[md5sum] = "9f7bfb53831ec3a6adfc97f39b23ab72"
SRC_URI[sha256sum] = "1ef228ae80875557eb6c1549deafed4dabbf3261cfcafa12f773fe0db9be8a36"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
"
