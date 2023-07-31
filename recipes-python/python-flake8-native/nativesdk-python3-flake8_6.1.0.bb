SUMMARY = "the modular source code checker: pep8, pyflakes and co"
HOMEPAGE = "https://gitlab.com/pycqa/flake8"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=75b26781f1adf1aa310bda6098937878"

DEPENDS += "\
    nativesdk-python3-mccabe \
    nativesdk-python3-pycodestyle \
    nativesdk-python3-pyflakes \
"

PYPI_PACKAGE = "flake8"

SRC_URI[md5sum] = "722df94bd0c8d720583a8a7a968ad170"
SRC_URI[sha256sum] = "d5b3857f07c030bdb5bf41c7f53799571d75c4491748a3adcd47de929e34cd23"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-json \
    nativesdk-python3-logging \
    nativesdk-python3-mccabe \
    nativesdk-python3-pycodestyle \
    nativesdk-python3-pyflakes \
"
