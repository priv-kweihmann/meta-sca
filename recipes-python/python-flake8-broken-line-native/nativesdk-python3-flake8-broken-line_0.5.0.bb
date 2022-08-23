SUMMARY = "Flake8 plugin to forbid backslashes (\) for line breaks"
HOMEPAGE = "https://github.com/sobolevn/flake8-broken-line"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=268c5fd9e64a788932af10a988ab35c4"

DEPENDS += "\
    nativesdk-python3-bandit \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-pycodestyle \
"

PYPI_PACKAGE = "flake8-broken-line"

SRC_URI[md5sum] = "0eafe2420392911584909cbdb156c40a"
SRC_URI[sha256sum] = "7c98de9dd1385b71e888709c7f2aee3f0514107ecb5875bc95d0c03392191c97"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-bandit \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-pycodestyle \
"
