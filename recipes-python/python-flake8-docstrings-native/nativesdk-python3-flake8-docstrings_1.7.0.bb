SUMMARY = "Extension for flake8 which uses pydocstyle to check docstrings"
HOMEPAGE = "https://github.com/pycqa/flake8-docstrings"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a34bc20b983e1104e2d50423b224b087"

DEPENDS += "\
    nativesdk-python3-flake8 \
    nativesdk-python3-pydocstyle \
"
SRC_URI[sha256sum] = "4c8cc748dc16e6869728699e5d0d685da9a10b0ea718e090b1ba088e67a941af"

SRC_URI:append = " file://0001-docstrings-allow-pydocstyle-dev-versions.patch"

PYPI_PACKAGE = "flake8_docstrings"

UPSTREAM_CHECK_REGEX ?= "/flake8-docstrings/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-pydocstyle \
"
