SUMMARY = "Rich is a Python library for rich text and beautiful formatting in the terminal"
HOMEPAGE = "https://github.com/Textualize/rich"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5f0b94fbc94f5ad9ae4efcf8a778303"

DEPENDS += "python3-pygments-native"

SRC_URI[sha256sum] = "b8c5f568a3a749f9290ec6bddedf835cec33696bfc1e48bcfecb276c7386e4b8"

PYPI_PACKAGE = "rich"

inherit pypi
inherit python_poetry_core
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-pygments"
