SUMMARY = "A plugin for Flake8 finding likely bugs and design problems in your program"
HOMEPAGE = "https://github.com/PyCQA/flake8-bugbear"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d511f8e447826b7e5b61da03a3f5e82b"

DEPENDS += "\
    nativesdk-python3-attrs \
    nativesdk-python3-flake8 \
"

PYPI_PACKAGE = "flake8-bugbear"

SRC_URI[md5sum] = "0da25b71697544c4ce84437b54bcf1c7"
SRC_URI[sha256sum] = "0ebdc7d8ec1ca8bd49347694562381f099f4de2f8ec6bda7a7dca65555d9e0d4"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-attrs \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
