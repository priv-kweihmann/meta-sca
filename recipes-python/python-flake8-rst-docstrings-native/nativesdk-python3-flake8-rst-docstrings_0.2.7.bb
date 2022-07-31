SUMMARY = "Python docstring reStructuredText (RST) validator"
HOMEPAGE = "https://github.com/peterjc/flake8-rst-docstrings"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=647e2c41944e325227c84555a6bced85"

DEPENDS += "\
    nativesdk-python3-flake8 \
    nativesdk-python3-restructuredtext-lint \
"

PYPI_PACKAGE = "flake8-rst-docstrings"

SRC_URI[md5sum] = "1193e2ba320176eea7899001adee3772"
SRC_URI[sha256sum] = "2740067ab9237559dd45a3434d8c987792c7b259ca563621a3b95efe201f5382"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-restructuredtext-lint \
"
