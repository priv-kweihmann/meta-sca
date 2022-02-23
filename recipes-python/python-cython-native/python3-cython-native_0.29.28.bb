SUMMARY = "The Cython compiler for writing C extensions for the Python language"
HOMEPAGE = "http://cython.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e23fadd6ceef8c618fc1c65191d846fa"

PYPI_PACKAGE = "Cython"

SRC_URI[md5sum] = "0e98543dca816300a27e7d76146a6280"
SRC_URI[sha256sum] = "d6fac2342802c30e51426828fe084ff4deb1b3387367cf98976bb2e64b6f8e45"

inherit pypi
inherit setuptools3
inherit native
