SUMMARY = "Flake8 lint for trailing commas"
HOMEPAGE = "https://github.com/PyCQA/flake8-commas/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "nativesdk-python3-flake8"

SRC_URI[sha256sum] = "940441ab8ee544df564ae3b3f49f20462d75d5c7cac2463e0b27436e2050f263"

PYPI_PACKAGE = "flake8-commas"

inherit setuptools3
inherit pypi
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
