SUMMARY = "A flake8 plugin that checks bad async / asyncio practices"
HOMEPAGE = "https://github.com/cooperlees/flake8-async"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=05d061bd936abacc3bb6f41de66200d4"

DEPENDS += "nativesdk-python3-flake8"

SRC_URI[sha256sum] = "b4db2d55883653b47d4bfd946fdf506e8958bb4ca35974790b8c3e620fc1abff"

PYPI_PACKAGE = "flake8-async"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
"
