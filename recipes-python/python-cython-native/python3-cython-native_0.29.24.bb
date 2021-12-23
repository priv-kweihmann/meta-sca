SUMMARY = "The Cython compiler for writing C extensions for the Python language"
HOMEPAGE = "http://cython.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e23fadd6ceef8c618fc1c65191d846fa"

PYPI_PACKAGE = "Cython"

SRC_URI[md5sum] = "81aff945f5bfdfb86e7a5d24f5467668"
SRC_URI[sha256sum] = "cdf04d07c3600860e8c2ebaad4e8f52ac3feb212453c1764a49ac08c827e8443"

inherit pypi
inherit setuptools3
inherit native
