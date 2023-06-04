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

PYPI_PACKAGE = "flake8_broken_line"

UPSTREAM_CHECK_REGEX ?= "/flake8-broken-line/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "5ced65c054fb299a50c401a3c095228e"
SRC_URI[sha256sum] = "e2c6a17f8d9a129e99c1320fce89b33843e2963871025c4c2bb7b8b8d8732a85"

inherit pypi
inherit python_poetry_core
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-bandit \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-pycodestyle \
"
