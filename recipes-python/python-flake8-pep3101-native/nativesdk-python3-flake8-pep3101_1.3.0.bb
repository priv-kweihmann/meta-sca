SUMMARY = "Checks for old string formatting"
HOMEPAGE = "https://github.com/gforcada/flake8-pep3101"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "nativesdk-python3-flake8"

PYPI_PACKAGE = "flake8-pep3101"

SRC_URI[md5sum] = "de11047e9657cfc091fe1a632603db95"
SRC_URI[sha256sum] = "86e3eb4e42de8326dcd98ebdeaf9a3c6854203a48f34aeb3e7e8ed948107f512"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
