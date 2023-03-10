SUMMARY = "Removes commented-out code"
HOMEPAGE = "https://github.com/myint/eradicate"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://eradicate;beginline=3;endline=23;md5=4665a3ee1ecb347243801ec86697f8a0"

PYPI_PACKAGE = "eradicate"

SRC_URI[md5sum] = "c848e8fde89f57782b3da4314201d908"
SRC_URI[sha256sum] = "c329a05def6a4b558dab58bb1b694f5209706b7c99ba174d226dfdb69a5ba0da"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-difflib \
"
