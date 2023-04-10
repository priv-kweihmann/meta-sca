SUMMARY = "The Cython compiler for writing C extensions for the Python language"
HOMEPAGE = "http://cython.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e23fadd6ceef8c618fc1c65191d846fa"

PYPI_PACKAGE = "Cython"

SRC_URI[md5sum] = "429fc3a9b8a79d4aab4e3e4b5ab0ff27"
SRC_URI[sha256sum] = "1909688f5d7b521a60c396d20bba9e47a1b2d2784bfb085401e1e1e7d29a29a8"

inherit pypi
inherit setuptools3
inherit native
