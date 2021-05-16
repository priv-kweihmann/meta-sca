SUMMARY = "Python PE parsing module"
HOMEPAGE = "https://github.com/erocarrera/pefile"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef2c924be9d0c8d6cf82374769748bfa"

DEPENDS += "\
            python3-future-native \
           "

PYPI_PACKAGE = "pefile"

SRC_URI[md5sum] = "bb81eb9c396ec805ff51457ccb6b2cd8"
SRC_URI[sha256sum] = "2aae0c135d4d37e81ff120e825af18b5e4884a97b9290aee811afd6317618f52"

inherit pypi
inherit setuptools3
inherit native
