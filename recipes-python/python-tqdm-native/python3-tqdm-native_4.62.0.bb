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

SRC_URI[md5sum] = "4ccb947ca1df0f16818ddb5533f5763f"
SRC_URI[sha256sum] = "3642d483b558eec80d3c831e23953582c34d7e4540db86d9e5ed9dad238dabc6"

inherit pypi
inherit setuptools3
inherit native
