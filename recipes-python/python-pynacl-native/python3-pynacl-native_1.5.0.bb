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

SRC_URI[md5sum] = "93989045e25f1111452cfdf5e021814d"
SRC_URI[sha256sum] = "8ac7448f09ab85811607bdd21ec2464495ac8b7c66d146bf545b0f08fb9220ba"

inherit pypi
inherit setuptools3
inherit native
