SUMMARY = "Utility library for gitignore style pattern matching of file paths"
HOMEPAGE = "https://github.com/cpburnz/python-path-specification"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

PYPI_PACKAGE = "pathspec"

SRC_URI[md5sum] = "e63930075b04e8c1b0a8617ac3a4a9e8"
SRC_URI[sha256sum] = "64d338d4e0914e91c1792321e6907b5a593f1ab1851de7fc269557a21b30ebbc"

inherit pypi
inherit setuptools3
inherit native
