SUMMARY = "Flake8 extension for checking quotes in python"
HOMEPAGE = "https://github.com/zheller/flake8-quotes"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

DEPENDS += "nativesdk-python3-flake8"

PYPI_PACKAGE = "flake8-quotes"

SRC_URI[md5sum] = "46be52360d02302ae82faed7adf1035c"
SRC_URI[sha256sum] = "6e26892b632dacba517bf27219c459a8396dcfac0f5e8204904c5a4ba9b480e1"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
