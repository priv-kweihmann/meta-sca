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

PYPI_PACKAGE = "flake8-eradicate"

SRC_URI[md5sum] = "a144d2aeedbf2efabde60d0a2587513c"
SRC_URI[sha256sum] = "3088cfd6717d1c9c6c3ac45ef2e5f5b6c7267f7504d5a74b781500e95cb9c7e1"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-attrs \
    nativesdk-python3-core \
    nativesdk-python3-eradicate \
    nativesdk-python3-flake8 \
"
