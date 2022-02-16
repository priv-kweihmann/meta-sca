SUMMARY = "Python wrapper for the GitHub API"
HOMEPAGE = "https://github.com/sigmavirus24/github3.py"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6b574ed4b26bdce9060017ce052d0109"

DEPENDS += "\
            python3-jwcrypto-native \
            python3-python-dateutil-native \
            python3-requests-native \
            python3-uritemplate-native \
           "

PYPI_PACKAGE = "github3.py"

SRC_URI[md5sum] = "520f3f7a2b582392fbc336607339b289"
SRC_URI[sha256sum] = "43133fbb2e4bfc8bab77ea996de6b027ea5054a958cc01f5efdcab3f5cb116ae"

inherit pypi
inherit setuptools3
inherit native
