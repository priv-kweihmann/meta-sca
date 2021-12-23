SUMMARY = "Python PE parsing module"
HOMEPAGE = "https://github.com/erocarrera/pefile"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef2c924be9d0c8d6cf82374769748bfa"

DEPENDS += "\
            python3-future-native \
           "

PYPI_PACKAGE = "pefile"

SRC_URI[md5sum] = "47969d5c421429cf9dc09a023547b621"
SRC_URI[sha256sum] = "344a49e40a94e10849f0fe34dddc80f773a12b40675bf2f7be4b8be578bdd94a"

inherit pypi
inherit setuptools3
inherit native
