SUMMARY = "A flake8 plugin that checks bad async / asyncio practices"
HOMEPAGE = "https://github.com/python-trio/flake8-async"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=218979ab483d4a6d1512d8978a38ce7c"

DEPENDS += "\
    python3-flake8-native \
    python3-libcst-native \
"

SRC_URI[sha256sum] = "7b432eff96910977cf865077909393cfbfec4c617ddd4a0b6b379075c878d8b5"

PYPI_PACKAGE = "flake8_async"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-libcst \
"
