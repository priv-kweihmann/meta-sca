SUMMARY = "Rich is a Python library for rich text and beautiful formatting in the terminal"
HOMEPAGE = "https://github.com/Textualize/rich"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5f0b94fbc94f5ad9ae4efcf8a778303"

DEPENDS += "python3-pygments-native"

SRC_URI[sha256sum] = "e497a48b844b0320d45007cdebfeaeed8db2a4f4bcf49f15e455cfc4af11eaa8"

PYPI_PACKAGE = "rich"

inherit pypi
inherit python_poetry_core
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-pygments"
