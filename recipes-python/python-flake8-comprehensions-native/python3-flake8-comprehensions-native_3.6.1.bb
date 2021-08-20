SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0699983c8f8199c37bee38509aacbbc6"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-comprehensions"

SRC_URI[md5sum] = "bd88e3eff67a19633da665e0fba21748"
SRC_URI[sha256sum] = "4888de89248b7f7535159189ff693c77f8354f6d37a02619fa28c9921a913aa0"

inherit pypi
inherit setuptools3
inherit native
