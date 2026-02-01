SUMMARY = "Soup Sieve is a CSS selector library designed to be used with Beautiful Soup 4"
HOMEPAGE = "https://github.com/facelessuser/soupsieve"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=74851a2f1e5c07496dcb452af6a6bf54"

PYPI_PACKAGE = "soupsieve"

SRC_URI[md5sum] = "8c20930a780872dafd6f22175398ccf7"
SRC_URI[sha256sum] = "3267f1eeea4251fb42728b6dfb746edc9acaffc4a45b27e19450b676586e8349"

inherit pypi
inherit python_hatchling
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-hatchling \
    nativesdk-python3-pathspec \
    nativesdk-python3-pluggy \
"
