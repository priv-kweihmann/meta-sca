SUMMARY = "Utility library for gitignore style pattern matching of file paths"
HOMEPAGE = "https://github.com/cpburnz/python-path-specification"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

PYPI_PACKAGE = "pathspec"

SRC_URI[md5sum] = "6f4fde5e701d328a2846d206edb63aa9"
SRC_URI[sha256sum] = "7ace6161b621d31e7902eb6b5ae148d12cfd23f4a249b9ffb6b9fee12084323d"

inherit pypi
inherit setuptools3
inherit native
