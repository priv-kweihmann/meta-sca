SUMMARY = "Rich is a Python library for rich text and beautiful formatting in the terminal"
HOMEPAGE = "https://github.com/Textualize/rich"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5f0b94fbc94f5ad9ae4efcf8a778303"

DEPENDS += "nativesdk-python3-pygments"

SRC_URI[sha256sum] = "87b43e0543149efa1253f485cd845bb7ee54df16c9617b8a893650ab84b4acb6"

PYPI_PACKAGE = "rich"

inherit pypi
inherit python_poetry_core
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-pygments"
