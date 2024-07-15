SUMMARY = "A helper library for Flake8 plugins"
HOMEPAGE = "https://github.com/python-formate/flake8-helper"

DEPENDS += "\
    nativesdk-python3-flake8 \
    python3-whey-native \
    python3-whey-pth-native \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a484934fb535cddc2470eef202da5a2"

SRC_URI[sha256sum] = "02e33eb8014c9accd802ef4a7a266e2ec8d7b9225ce94d19bd537d4631bb4f87"

inherit pypi
inherit python_pep517
inherit python3native
inherit setuptools3-base
inherit_defer nativesdk

python_pep517_do_compile () {
    nativepython3 -m whey --out-dir ${PEP517_WHEEL_PATH} --wheel ${PEP517_BUILD_OPTS} ${PEP517_SOURCE_PATH}
}

PYPI_PACKAGE = "flake8_helper"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
