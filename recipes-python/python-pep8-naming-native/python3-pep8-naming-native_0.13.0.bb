SUMMARY = "Naming Convention checker for Python"
HOMEPAGE = "https://github.com/PyCQA/pep8-naming"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6aba56fb2ab6893b08fb8daa7eeba461"

DEPENDS += "python3-flake8-polyfill-native"

PYPI_PACKAGE = "pep8-naming"

SRC_URI[md5sum] = "8dce7ff11eb5998dc42040b07170d207"
SRC_URI[sha256sum] = "9f38e6dcf867a1fb7ad47f5ff72c0ddae544a6cf64eb9f7600b7b3c0bb5980b5"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
"
