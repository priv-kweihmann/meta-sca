SUMMARY = "Soup Sieve is a CSS selector library designed to be used with Beautiful Soup 4"
HOMEPAGE = "https://github.com/facelessuser/soupsieve"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=520586fa71ed2cbda50b4a8c89621e09"

PYPI_PACKAGE = "soupsieve"

SRC_URI[md5sum] = "88ae72bd970b425692235d17224204e6"
SRC_URI[sha256sum] = "5663d5a7b3bfaeee0bc4372e7fc48f9cff4940b3eec54a6451cc5299f1097690"

inherit pypi
inherit python_hatchling
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-hatchling \
    nativesdk-python3-pathspec \
    nativesdk-python3-pluggy \
"
