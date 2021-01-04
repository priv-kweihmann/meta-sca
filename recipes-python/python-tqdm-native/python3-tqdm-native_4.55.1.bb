SUMMARY = "Fast, Extensible Progress Meter"
HOMEPAGE = "https://github.com/tqdm/tqdm"

LICENSE = "MIT & MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENCE;md5=7ea57584e3f8bbde2ae3e1537551de25"

DEPENDS += "\
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "tqdm"

SRC_URI[md5sum] = "43c9e06dad24b12974c77bdf18fb60f1"
SRC_URI[sha256sum] = "556c55b081bd9aa746d34125d024b73f0e2a0e62d5927ff0e400e20ee0a03b9a"

inherit pypi
inherit native
inherit setuptools3
