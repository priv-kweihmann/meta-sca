SUMMARY = "Rich is a Python library for rich text and beautiful formatting in the terminal"
HOMEPAGE = "https://github.com/Textualize/rich"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5f0b94fbc94f5ad9ae4efcf8a778303"

DEPENDS += "python3-pygments-native"

SRC_URI[sha256sum] = "a5ac1f1cd448ade0d59cc3356f7db7a7ccda2c8cbae9c7a90c28ff463d3e91f4"

PYPI_PACKAGE = "rich"

inherit pypi
inherit python_poetry_core
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-pygments"
