SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            ${PYTHON_PN}-ddt-native \
            ${PYTHON_PN}-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "321e1b431f28a2157dbd72dce8932ff7"
SRC_URI[sha256sum] = "6d4f10e2aaad1864bb0f17ec06a2c2831534140e5883c350d58b4e85189dab74"

inherit pypi
inherit setuptools3
inherit native
