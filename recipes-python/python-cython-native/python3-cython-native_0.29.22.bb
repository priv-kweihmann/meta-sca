SUMMARY = "The Cython compiler for writing C extensions for the Python language"
HOMEPAGE = "http://cython.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e23fadd6ceef8c618fc1c65191d846fa"

PYPI_PACKAGE = "Cython"

SRC_URI[md5sum] = "15a4f0cee5cbd1f400ae0d9736dfcfe6"
SRC_URI[sha256sum] = "df6b83c7a6d1d967ea89a2903e4a931377634a297459652e4551734c48195406"

inherit pypi
inherit setuptools3
inherit native
