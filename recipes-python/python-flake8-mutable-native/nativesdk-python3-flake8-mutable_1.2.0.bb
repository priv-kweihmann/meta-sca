SUMMARY = "flake8 extension for mutable default arguments"
HOMEPAGE = "https://github.com/ebeweber/flake8-mutable"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d524be351dfcd0878798ce25ede527ce"

DEPENDS += "\
    nativesdk-python3-flake8 \
    nativesdk-python3-mccabe \
    nativesdk-python3-pep8 \
    nativesdk-python3-pyflakes \
    python3-pytest-runner-native \
"

PYPI_PACKAGE = "flake8-mutable"

SRC_URI[md5sum] = "5976fbe6c578d8c43ba1a8c372bdc3a5"
SRC_URI[sha256sum] = "ee9b77111b867d845177bbc289d87d541445ffcc6029a0c5c65865b42b18c6a6"

PYPI_ESCAPE_PACKAGE_NAME = "0"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-mccabe \
    nativesdk-python3-pep8 \
    nativesdk-python3-pyflakes \
"
