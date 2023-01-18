SUMMARY = "The Cython compiler for writing C extensions for the Python language"
HOMEPAGE = "http://cython.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e23fadd6ceef8c618fc1c65191d846fa"

PYPI_PACKAGE = "Cython"

SRC_URI[md5sum] = "bd42c555cb2298b8a94fa8de7ee679ba"
SRC_URI[sha256sum] = "5040764c4a4d2ce964a395da24f0d1ae58144995dab92c6b96f44c3f4d72286a"

inherit pypi
inherit setuptools3
inherit native
