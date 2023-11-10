
SUMMARY = "flake8 plugin that integrates isort"
HOMEPAGE = "https://github.com/gforcada/flake8-isort"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "\
            python3-flake8-native \
            python3-isort-native \
            python3-testfixtures-native \
            "

SRC_URI[sha256sum] = "c1f82f3cf06a80c13e1d09bfae460e9666255d5c780b859f19f8318d420370b3"

PYPI_PACKAGE = "flake8_isort"

inherit pypi
inherit python_hatchling
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-isort \
    nativesdk-python3-testfixtures \
"
