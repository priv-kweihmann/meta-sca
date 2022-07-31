SUMMARY = "The Cython compiler for writing C extensions for the Python language"
HOMEPAGE = "http://cython.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e23fadd6ceef8c618fc1c65191d846fa"

PYPI_PACKAGE = "Cython"

SRC_URI[md5sum] = "91c36ea86c00adcc5c1c11cf48b733c0"
SRC_URI[sha256sum] = "8733cf4758b79304f2a4e39ebfac5e92341bce47bcceb26c1254398b2f8c1af7"

inherit pypi
inherit setuptools3
inherit native
