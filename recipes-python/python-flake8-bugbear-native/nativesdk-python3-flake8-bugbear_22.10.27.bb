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

SRC_URI[md5sum] = "5ae118d5dbc9b893dd22c2d0afb7fe93"
SRC_URI[sha256sum] = "a6708608965c9e0de5fff13904fed82e0ba21ac929fe4896459226a797e11cd5"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-attrs \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
