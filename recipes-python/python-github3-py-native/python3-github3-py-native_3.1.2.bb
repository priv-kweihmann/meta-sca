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

SRC_URI[md5sum] = "22ef7fc4cbd746e6a048e3f522d57566"
SRC_URI[sha256sum] = "c083918d51ef59ed7a5ce825301551038e14d58c8b3fcbc3bf9d03916e639ba1"

inherit pypi
inherit setuptools3
inherit native
