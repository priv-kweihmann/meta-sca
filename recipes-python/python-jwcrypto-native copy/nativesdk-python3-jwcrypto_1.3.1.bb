SUMMARY = "Implementation of JOSE Web standards"
HOMEPAGE = "https://github.com/latchset/jwcrypto"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
    nativesdk-python3-cryptography \
    nativesdk-python3-deprecated \
"

PYPI_PACKAGE = "jwcrypto"

SRC_URI[md5sum] = "66092293481ade3c7df7b9b18ab421d1"
SRC_URI[sha256sum] = "54b551b115ffb4d12b1f1ee93b8ba2a71bb8556ba3d85d62f707549613da877c"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-cryptography \
    nativesdk-python3-deprecated \
"
