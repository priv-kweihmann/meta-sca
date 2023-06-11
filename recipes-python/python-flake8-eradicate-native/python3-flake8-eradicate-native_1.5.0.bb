SUMMARY = "Flake8 plugin to find commented out or dead code"
HOMEPAGE = "https://github.com/sobolevn/flake8-eradicate"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=268c5fd9e64a788932af10a988ab35c4"

DEPENDS += "\
            python3-attrs-native \
            python3-eradicate-native \
            python3-flake8-native \
            "

PYPI_PACKAGE = "flake8_eradicate"

UPSTREAM_CHECK_REGEX ?= "/flake8-eradicate/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "e2aca5337289e2279b3463365e2c0169"
SRC_URI[sha256sum] = "aee636cb9ecb5594a7cd92d67ad73eb69909e5cc7bd81710cf9d00970f3983a6"

inherit pypi
inherit python_poetry_core
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-attrs \
    nativesdk-python3-core \
    nativesdk-python3-eradicate \
    nativesdk-python3-flake8 \
"
