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

SRC_URI[md5sum] = "e81cf8a2de3477a82cc5ff8bb768f089"
SRC_URI[sha256sum] = "4cdb2c06e229971104443ae293e75e64c6107798229202fbe4f4091427a30ac0"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-attrs \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
