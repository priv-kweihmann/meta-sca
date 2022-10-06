SUMMARY = "Flake8 plugin to forbid backslashes (\) for line breaks"
HOMEPAGE = "https://github.com/sobolevn/flake8-broken-line"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=268c5fd9e64a788932af10a988ab35c4"

DEPENDS += "\
            python3-bandit-native \
            python3-flake8-native \
            python3-flake8-polyfill-native \
            python3-pycodestyle-native \
            "

PYPI_PACKAGE = "flake8-broken-line"

SRC_URI[md5sum] = "c1ede859598dc3b4c55c51c28a4a9f34"
SRC_URI[sha256sum] = "a02268f11a18837c83c59013a36cc00fee9e17a042745cc0c9895f1c9f6acc16"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-bandit \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-pycodestyle \
"
