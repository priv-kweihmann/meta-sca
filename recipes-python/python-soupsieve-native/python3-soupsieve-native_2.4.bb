SUMMARY = "Soup Sieve is a CSS selector library designed to be used with Beautiful Soup 4"
HOMEPAGE = "https://github.com/facelessuser/soupsieve"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c7a2acf04248c0d02dac4c82ee8a7f56"

PYPI_PACKAGE = "soupsieve"

SRC_URI[md5sum] = "10732f2066afc9c209c9258d336e5fb4"
SRC_URI[sha256sum] = "e28dba9ca6c7c00173e34e4ba57448f0688bb681b7c5e8bf4971daafc093d69a"

inherit pypi
inherit python_hatchling
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-hatchling \
    nativesdk-python3-pathspec \
    nativesdk-python3-pluggy \
"
