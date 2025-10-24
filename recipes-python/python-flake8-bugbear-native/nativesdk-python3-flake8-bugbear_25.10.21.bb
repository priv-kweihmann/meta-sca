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

SRC_URI[md5sum] = "4f3d873f7b4663a19059cdc4fa39b631"
SRC_URI[sha256sum] = "2876afcaed8bfb3464cf33e3ec42cc3bec0a004165b84400dc3392b0547c2714"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-attrs \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
