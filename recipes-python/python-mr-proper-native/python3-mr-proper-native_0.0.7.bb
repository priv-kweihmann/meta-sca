SUMMARY = "Static Python code analyzer"
HOMEPAGE = "https://github.com/best-doctor/mr_proper"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f11c6d8f4ab2580d92ae26f11135767"

DEPENDS += "\
            python3-click-native \
            python3-setuptools-native \
            python3-stdlib-list-native \
            "

PYPI_PACKAGE = "mr_proper"

SRC_URI[sha256sum] = "03b517b19e617537f711ce418b125e5f2efd82ec881539cdee83195c78c14a02"

inherit pypi
inherit native
