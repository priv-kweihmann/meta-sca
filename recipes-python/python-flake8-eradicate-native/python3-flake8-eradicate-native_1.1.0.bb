SUMMARY = "Flake8 plugin to find commented out or dead code"
HOMEPAGE = "https://github.com/sobolevn/flake8-eradicate"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=268c5fd9e64a788932af10a988ab35c4"

DEPENDS += "\
            python3-attrs-native \
            python3-eradicate-native \
            python3-flake8-native \
            "

PYPI_PACKAGE = "flake8-eradicate"

SRC_URI[md5sum] = "960da162e0bce61edb40697a68691b61"
SRC_URI[sha256sum] = "f5917d6dbca352efcd10c15fdab9c55c48f0f26f6a8d47898b25d39101f170a8"

inherit pypi
inherit setuptools3
inherit native
