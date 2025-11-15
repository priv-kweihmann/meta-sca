SUMMARY = "Check for python builtins being used as variables or parameters"
HOMEPAGE = "https://github.com/gforcada/flake8-builtins"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "\
    nativesdk-python3-flake8 \
    nativesdk-python3-mccabe \
    nativesdk-python3-pycodestyle \
    nativesdk-python3-pyflakes \
"

PYPI_PACKAGE = "flake8-builtins"

SRC_URI[md5sum] = "90f2bde97f430fcb950c1c6f064ac95a"
SRC_URI[sha256sum] = "10d29d7a81ba6546a26461e83ce1936644764a678ff6337b97a894ebc4db07c1"

inherit pypi
inherit pypi-old
inherit python_hatchling
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-mccabe \
    nativesdk-python3-pycodestyle \
    nativesdk-python3-pyflakes \
"
