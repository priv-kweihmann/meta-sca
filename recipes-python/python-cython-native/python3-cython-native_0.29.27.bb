SUMMARY = "The Cython compiler for writing C extensions for the Python language"
HOMEPAGE = "http://cython.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e23fadd6ceef8c618fc1c65191d846fa"

PYPI_PACKAGE = "Cython"

SRC_URI[md5sum] = "2b2ba86abcf823985935d37f5e43b19a"
SRC_URI[sha256sum] = "c6a442504db906dfc13a480e96850cced994ecdc076bcf492c43515b78f70da2"

inherit pypi
inherit setuptools3
inherit native
