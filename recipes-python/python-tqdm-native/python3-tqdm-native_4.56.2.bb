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

SRC_URI[md5sum] = "1c93341fe09d2e7715e19816a57a227a"
SRC_URI[sha256sum] = "11d544652edbdfc9cc41aa4c8a5c166513e279f3f2d9f1a9e1c89935b51de6ff"

inherit pypi
inherit setuptools3
inherit native
