
SUMMARY = "flake8 plugin that integrates isort"
HOMEPAGE = "https://github.com/gforcada/flake8-isort"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "\
    nativesdk-python3-flake8 \
    nativesdk-python3-isort \
    nativesdk-python3-testfixtures \
"

SRC_URI[sha256sum] = "9d0452acdf0e1cd6f2d6848e3605e66b54d920e73471fb4744eef0f93df62d5d"

PYPI_PACKAGE = "flake8-isort"

inherit pypi
inherit pypi-old
inherit python_hatchling
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-isort \
    nativesdk-python3-testfixtures \
"
