SUMMARY = "Rich is a Python library for rich text and beautiful formatting in the terminal"
HOMEPAGE = "https://github.com/Textualize/rich"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5f0b94fbc94f5ad9ae4efcf8a778303"

DEPENDS += "python3-pygments-native"

SRC_URI[sha256sum] = "9be308cb1fe2f1f57d67ce99e95af38a1e2bc71ad9813b0e247cf7ffbcc3a432"

PYPI_PACKAGE = "rich"

inherit pypi
inherit python_poetry_core
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-pygments"
