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

SRC_URI[md5sum] = "6c727c5886c4e8b3c92291b0d977d89d"
SRC_URI[sha256sum] = "09998853b2405e98e61d2ff3027c47033adbdc17f9fe44ca58443d876eb00f3b"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-mccabe \
    nativesdk-python3-pycodestyle \
    nativesdk-python3-pyflakes \
"
