SUMMARY = "The Cython compiler for writing C extensions for the Python language"
HOMEPAGE = "http://cython.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e23fadd6ceef8c618fc1c65191d846fa"

PYPI_PACKAGE = "Cython"

SRC_URI[md5sum] = "82837814b8d72d353e16bb9344e914b1"
SRC_URI[sha256sum] = "6a0d31452f0245daacb14c979c77e093eb1a546c760816b5eed0047686baad8e"

inherit pypi
inherit setuptools3
inherit native
