SUMMARY = "A plugin for Flake8 finding likely bugs and design problems in your program"
HOMEPAGE = "https://github.com/PyCQA/flake8-bugbear"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d511f8e447826b7e5b61da03a3f5e82b"

DEPENDS += "\
    nativesdk-python3-attrs \
    nativesdk-python3-flake8 \
"

PYPI_PACKAGE = "flake8_bugbear"

SRC_URI[md5sum] = "e6ca6333a7c4f0f211642f30efbe4105"
SRC_URI[sha256sum] = "435b531c72b27f8eff8d990419697956b9fd25c6463c5ba98b3991591de439db"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-attrs \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
