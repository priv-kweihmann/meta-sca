SUMMARY = "The Cython compiler for writing C extensions for the Python language"
HOMEPAGE = "http://cython.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e23fadd6ceef8c618fc1c65191d846fa"

PYPI_PACKAGE = "Cython"

SRC_URI[md5sum] = "971c9708dd5269180868fc0af986084c"
SRC_URI[sha256sum] = "af377d543a762867da11fcf6e558f7a4a535ff8693f30cce123fab10c00fa312"

inherit pypi
inherit setuptools3
inherit native
