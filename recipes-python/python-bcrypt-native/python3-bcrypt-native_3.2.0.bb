SUMMARY = "Modern(-ish) password hashing for your software and your servers"
HOMEPAGE = "https://github.com/pyca/bcrypt/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += "python3-cffi-native"

PYPI_PACKAGE = "bcrypt"

SRC_URI[md5sum] = "fe31390dab603728f756cd3d6830c80a"
SRC_URI[sha256sum] = "5b93c1726e50a93a033c36e5ca7fdcd29a5c7395af50a6892f5d9e7c6cfbfb29"

inherit pypi
inherit setuptools3
inherit native
