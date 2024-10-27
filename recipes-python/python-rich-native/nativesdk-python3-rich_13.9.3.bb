SUMMARY = "Rich is a Python library for rich text and beautiful formatting in the terminal"
HOMEPAGE = "https://github.com/Textualize/rich"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5f0b94fbc94f5ad9ae4efcf8a778303"

DEPENDS += "nativesdk-python3-pygments"

SRC_URI[sha256sum] = "bc1e01b899537598cf02579d2b9f4a415104d3fc439313a7a2c165d76557a08e"

PYPI_PACKAGE = "rich"

inherit pypi
inherit python_poetry_core
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-pygments"
