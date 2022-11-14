SUMMARY = "Utility library for gitignore style pattern matching of file paths"
HOMEPAGE = "https://github.com/cpburnz/python-path-specification"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

PYPI_PACKAGE = "pathspec"

SRC_URI[md5sum] = "28c87c3581b10152c4581d10fe33f765"
SRC_URI[sha256sum] = "8f6bf73e5758fd365ef5d58ce09ac7c27d2833a8d7da51712eac6e27e35141b0"

inherit pypi
inherit setuptools3
inherit nativesdk
