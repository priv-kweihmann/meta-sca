SUMMARY = "Various code metrics for Python code"
HOMEPAGE = "https://github.com/rubik/radon"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4540bac589ba237d0f9238a399607ca"

DEPENDS += "\
    nativesdk-python3-colorama \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-future \
    nativesdk-python3-mando \
"

PYPI_PACKAGE = "radon"

SRC_URI[md5sum] = "8c0ba595d9f98729065c1fcd60871c71"
SRC_URI[sha256sum] = "d1ac0053943a893878940fedc8b19ace70386fc9c9bf0a09229a44125ebf45b5"

inherit pypi
inherit python_poetry_core
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-colorama \
    nativesdk-python3-core \
    nativesdk-python3-crypt \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-future \
    nativesdk-python3-json \
    nativesdk-python3-mando \
    nativesdk-python3-pytest \
    nativesdk-python3-xml \
"
