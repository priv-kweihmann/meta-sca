SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
HOMEPAGE = "https://github.com/pyca/pynacl"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8cc789b082b3d97e1ccc5261f8594d3f"

DEPENDS += "\
            python3-cffi-native \
            python3-six-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "PyNaCl"

SRC_URI[md5sum] = "8c6c57893327a694c72510fb620e4744"
SRC_URI[sha256sum] = "54e9a2c849c742006516ad56a88f5c74bf2ce92c9f67435187c3c5953b346505"

inherit pypi
inherit setuptools3
inherit native
