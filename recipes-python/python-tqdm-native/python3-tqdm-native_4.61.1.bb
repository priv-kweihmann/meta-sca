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

SRC_URI[md5sum] = "e1ce1e151b669ffff03ffd37c904f338"
SRC_URI[sha256sum] = "24be966933e942be5f074c29755a95b315c69a91f839a29139bf26ffffe2d3fd"

inherit pypi
inherit setuptools3
inherit native
