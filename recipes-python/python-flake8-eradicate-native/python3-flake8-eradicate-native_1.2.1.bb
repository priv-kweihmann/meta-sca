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

SRC_URI[md5sum] = "e61a37173cee4bb58b9a2b8c1e9578c2"
SRC_URI[sha256sum] = "e486f8ab7e2dba3667223688e9239158fbf4ecaa88125e2283bcda81171412b7"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-attrs \
    nativesdk-python3-core \
    nativesdk-python3-eradicate \
    nativesdk-python3-flake8 \
"
