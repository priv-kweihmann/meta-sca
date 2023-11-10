SUMMARY = "Checks for old string formatting"
HOMEPAGE = "https://github.com/gforcada/flake8-pep3101"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8_pep3101"

SRC_URI[md5sum] = "54314b591034e79d2379fc44aee748ed"
SRC_URI[sha256sum] = "1b84b61685f1e631f2f710e5d5ed3ca68b5fc45fb9402fa8ae1b8a9a058a3387"

inherit pypi
inherit python_hatchling
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
