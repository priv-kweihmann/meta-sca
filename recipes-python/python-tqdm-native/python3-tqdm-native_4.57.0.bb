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

SRC_URI[md5sum] = "dec5743226324ac5bd188b3cbae07ef9"
SRC_URI[sha256sum] = "65185676e9fdf20d154cffd1c5de8e39ef9696ff7e59fe0156b1b08e468736af"

inherit pypi
inherit setuptools3
inherit native
