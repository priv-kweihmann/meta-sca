SUMMARY = "Fast, Extensible Progress Meter"
HOMEPAGE = "https://github.com/tqdm/tqdm"

LICENSE = "MIT & MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENCE;md5=59e4271a933d33edfe60237db377a14b"

DEPENDS += "\
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "tqdm"

SRC_URI[md5sum] = "33b29c38daf6a4df3c9303283cde3865"
SRC_URI[sha256sum] = "a4d6d112e507ef98513ac119ead1159d286deab17dffedd96921412c2d236ff5"

inherit pypi
inherit setuptools3
inherit native
