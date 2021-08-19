SUMMARY = "Python wrapper for the GitHub API"
HOMEPAGE = "https://github.com/sigmavirus24/github3.py"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d51d83fdbd6608d10a71666840ef5d15"

DEPENDS += "\
            python3-jwcrypto-native \
            python3-python-dateutil-native \
            python3-requests-native \
            python3-uritemplate-native \
           "

PYPI_PACKAGE = "github3.py"

SRC_URI[md5sum] = "3a2e1f683a75b4fdd5fe38fbcf6518bc"
SRC_URI[sha256sum] = "8dd4ac612fd60cb277eaf6e2ce02f68dda54aba06870ca6fa2b28369bf39aa14"

inherit pypi
inherit setuptools3
inherit native
