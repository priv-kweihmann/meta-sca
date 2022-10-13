SUMMARY = "Checks for old string formatting"
HOMEPAGE = "https://github.com/gforcada/flake8-pep3101"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-pep3101"

SRC_URI[md5sum] = "1aaee8192088962faea260d9b736ea70"
SRC_URI[sha256sum] = "ae2ee1758734a473ca971b4bf9ff09c961b6099916db91fdb6b9718328dfcacb"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
