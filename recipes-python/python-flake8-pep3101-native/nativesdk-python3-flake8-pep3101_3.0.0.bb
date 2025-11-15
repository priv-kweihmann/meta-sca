SUMMARY = "Checks for old string formatting"
HOMEPAGE = "https://github.com/gforcada/flake8-pep3101"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "nativesdk-python3-flake8"

PYPI_PACKAGE = "flake8-pep3101"

SRC_URI[md5sum] = "dd2f56e764b4c201bfc4b405f55cae2f"
SRC_URI[sha256sum] = "15f5978cee8983912a55af16a66f3518eead3ed2df65e3ee5735451e4fe344db"

inherit pypi
inherit pypi-old
inherit python_hatchling
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
