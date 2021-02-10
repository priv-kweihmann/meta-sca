SUMMARY = "The Cython compiler for writing C extensions for the Python language"
HOMEPAGE = "http://cython.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e23fadd6ceef8c618fc1c65191d846fa"

PYPI_PACKAGE = "Cython"

SRC_URI[md5sum] = "12c5e45af71dcc6dff28cdcbcbef6f39"
SRC_URI[sha256sum] = "e57acb89bd55943c8d8bf813763d20b9099cc7165c0f16b707631a7654be9cad"

inherit pypi
inherit setuptools3
inherit native
