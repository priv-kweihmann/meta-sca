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

SRC_URI[md5sum] = "b48ebfd77707032d2439eadeaa165ce8"
SRC_URI[sha256sum] = "fe7167226676823d50cf540532302a6f576c5a398c5260692571a05ef72c5f5b"

inherit pypi
inherit setuptools3
inherit native
