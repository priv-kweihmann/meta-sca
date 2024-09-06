SUMMARY = "Soup Sieve is a CSS selector library designed to be used with Beautiful Soup 4"
HOMEPAGE = "https://github.com/facelessuser/soupsieve"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=1bdfa4c8e8b6830bcf8e78cba1669e4d"

PYPI_PACKAGE = "soupsieve"

SRC_URI[md5sum] = "19126989f90d775ebe752b7fcacf1fc5"
SRC_URI[sha256sum] = "e2e68417777af359ec65daac1057404a3c8a5455bb8abc36f1a9866ab1a51abb"

inherit pypi
inherit python_hatchling
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-hatchling \
    nativesdk-python3-pathspec \
    nativesdk-python3-pluggy \
"
