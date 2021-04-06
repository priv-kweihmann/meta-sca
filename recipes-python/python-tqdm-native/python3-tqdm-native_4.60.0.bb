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

SRC_URI[md5sum] = "887003c3adeae3aa71fc243130504b2a"
SRC_URI[sha256sum] = "ebdebdb95e3477ceea267decfc0784859aa3df3e27e22d23b83e9b272bf157ae"

inherit pypi
inherit setuptools3
inherit native
