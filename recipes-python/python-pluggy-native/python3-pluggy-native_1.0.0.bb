SUMMARY = "A minimalist production ready plugin system"
HOMEPAGE = "https://github.com/pytest-dev/pluggy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c8206d16fd5cc02fa9b0bb98955e5c2"

DEPENDS += "python3-importlib-metadata-native"

PYPI_PACKAGE = "pluggy"

SRC_URI[md5sum] = "daa6fddfb6cd364f3c82e52098911e4b"
SRC_URI[sha256sum] = "4224373bacce55f955a878bf9cfa763c1e360858e330072059e10bad68531159"

inherit pypi
inherit setuptools3
inherit native
