SUMMARY = "Soup Sieve is a CSS selector library designed to be used with Beautiful Soup 4"
HOMEPAGE = "https://github.com/facelessuser/soupsieve"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=520586fa71ed2cbda50b4a8c89621e09"

PYPI_PACKAGE = "soupsieve"

SRC_URI[md5sum] = "093de5ec28f88c434d18b85798f74f4c"
SRC_URI[sha256sum] = "89d12b2d5dfcd2c9e8c22326da9d9aa9cb3dfab0a83a024f05704076ee8d35ea"

inherit pypi
inherit python_hatchling
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-hatchling \
    nativesdk-python3-pathspec \
    nativesdk-python3-pluggy \
"
