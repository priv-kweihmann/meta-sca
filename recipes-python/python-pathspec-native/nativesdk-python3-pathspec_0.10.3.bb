SUMMARY = "Utility library for gitignore style pattern matching of file paths"
HOMEPAGE = "https://github.com/cpburnz/python-path-specification"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

PYPI_PACKAGE = "pathspec"

SRC_URI[md5sum] = "d89408b52aff020ac768a14c0ef1c7de"
SRC_URI[sha256sum] = "56200de4077d9d0791465aa9095a01d421861e405b5096955051deefd697d6f6"

inherit pypi
inherit setuptools3
inherit nativesdk
