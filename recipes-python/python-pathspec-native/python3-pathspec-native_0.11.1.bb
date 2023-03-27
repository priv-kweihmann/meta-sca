SUMMARY = "Utility library for gitignore style pattern matching of file paths"
HOMEPAGE = "https://github.com/cpburnz/python-path-specification"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

PYPI_PACKAGE = "pathspec"

SRC_URI[md5sum] = "22d173ba2a5912738b2b70e93a0d4b5f"
SRC_URI[sha256sum] = "2798de800fa92780e33acca925945e9a19a133b715067cf165b8866c15a31687"

inherit pypi
inherit setuptools3
inherit native
