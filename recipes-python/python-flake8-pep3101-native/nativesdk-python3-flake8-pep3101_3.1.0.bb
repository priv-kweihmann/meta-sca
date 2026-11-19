SUMMARY = "Checks for old string formatting"
HOMEPAGE = "https://github.com/gforcada/flake8-pep3101"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "nativesdk-python3-flake8"

PYPI_PACKAGE = "flake8-pep3101"

SRC_URI[md5sum] = "67f866bd2998f81fd9cf4793e1e802af"
SRC_URI[sha256sum] = "03d6a3503391cb0fe4cca838767443deb5185c5c1d9876d6aae73e7d7f890461"

inherit pypi
inherit pypi-old
inherit python_hatchling
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
