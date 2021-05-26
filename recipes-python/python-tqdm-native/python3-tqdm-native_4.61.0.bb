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

SRC_URI[md5sum] = "d210f42b795f8dc6ecd2f87046940471"
SRC_URI[sha256sum] = "cd5791b5d7c3f2f1819efc81d36eb719a38e0906a7380365c556779f585ea042"

inherit pypi
inherit setuptools3
inherit native
