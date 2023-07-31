SUMMARY = "Utility library for gitignore style pattern matching of file paths"
HOMEPAGE = "https://github.com/cpburnz/python-path-specification"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

PYPI_PACKAGE = "pathspec"

SRC_URI[md5sum] = "92ebd6d735d261952ff99d64083eeff4"
SRC_URI[sha256sum] = "e0d8d0ac2f12da61956eb2306b69f9469b42f4deb0f3cb6ed47b9cce9996ced3"

inherit pypi
inherit setuptools3
inherit nativesdk
