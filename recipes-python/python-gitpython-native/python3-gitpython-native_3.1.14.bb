SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            python3-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "8d4a922cb32ce13b5c91fee1e4ecd84c"
SRC_URI[sha256sum] = "be27633e7509e58391f10207cd32b2a6cf5b908f92d9cd30da2e514e1137af61"

inherit pypi
inherit setuptools3
inherit native
