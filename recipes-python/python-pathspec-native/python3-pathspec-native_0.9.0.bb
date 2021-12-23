SUMMARY = "Utility library for gitignore style pattern matching of file paths"
HOMEPAGE = "https://github.com/cpburnz/python-path-specification"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

PYPI_PACKAGE = "pathspec"

SRC_URI[md5sum] = "9b6b70fa5ffc31e6f5700522880140c0"
SRC_URI[sha256sum] = "e564499435a2673d586f6b2130bb5b95f04a3ba06f81b8f895b651a3c76aabb1"

inherit pypi
inherit setuptools3
inherit native
