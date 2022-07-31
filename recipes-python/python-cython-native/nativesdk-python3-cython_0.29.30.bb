SUMMARY = "The Cython compiler for writing C extensions for the Python language"
HOMEPAGE = "http://cython.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e23fadd6ceef8c618fc1c65191d846fa"

PYPI_PACKAGE = "Cython"

SRC_URI[md5sum] = "3cf4001b4be42a263f163865235c39d8"
SRC_URI[sha256sum] = "2235b62da8fe6fa8b99422c8e583f2fb95e143867d337b5c75e4b9a1a865f9e3"

inherit pypi
inherit setuptools3
inherit nativesdk
