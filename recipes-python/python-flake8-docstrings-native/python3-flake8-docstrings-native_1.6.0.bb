SUMMARY = "Extension for flake8 which uses pydocstyle to check docstrings"
HOMEPAGE = "https://gitlab.com/pycqa/flake8-docstrings"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a34bc20b983e1104e2d50423b224b087"

DEPENDS += "\
            python3-flake8-native \
            python3-pydocstyle-native \
            "
SRC_URI[md5sum] = "ef95e19755f21a0a32d79cea8af73c45"
SRC_URI[sha256sum] = "9fe7c6a306064af8e62a055c2f61e9eb1da55f84bb39caef2b84ce53708ac34b"

PYPI_PACKAGE = "flake8-docstrings"

inherit pypi
inherit setuptools3
inherit native
