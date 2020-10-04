SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            ${PYTHON_PN}-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "6efdc926f4e363a3c732ca7633e8c957"
SRC_URI[sha256sum] = "a03f728b49ce9597a6655793207c6ab0da55519368ff5961e4a74ae475b9fa8e"

inherit pypi
inherit setuptools3
inherit native
