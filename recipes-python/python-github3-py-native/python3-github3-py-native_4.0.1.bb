SUMMARY = "Python wrapper for the GitHub API"
HOMEPAGE = "https://github.com/sigmavirus24/github3.py"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e695a36dabf568262a2a466c02c66405"

DEPENDS += "\
    python3-jwcrypto-native \
    python3-pyjwt-native \
    python3-python-dateutil-native \
    python3-requests-native \
    python3-uritemplate-native \
"

PYPI_PACKAGE = "github3.py"
PYPI_ESCAPE_PACKAGE_NAME = "0"

SRC_URI[md5sum] = "b996c56b32ef5abe54dc3537c70d826d"
SRC_URI[sha256sum] = "30d571076753efc389edc7f9aaef338a4fcb24b54d8968d5f39b1342f45ddd36"

inherit pypi
inherit pypi-old
inherit python_hatchling
inherit_defer native
