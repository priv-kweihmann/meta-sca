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

SRC_URI[md5sum] = "75d3b5d027a1fc14fe5c289273ae681d"
SRC_URI[sha256sum] = "2874fa525c051177583ec59c0fb4583e91f28ccd3f217ffad2acdb32d2c789ac"

inherit pypi
inherit setuptools3
inherit native
