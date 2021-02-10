SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            python3-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "adcb3858440aad3d0d8715ae5eaba65d"
SRC_URI[sha256sum] = "8621a7e777e276a5ec838b59280ba5272dd144a18169c36c903d8b38b99f750a"

inherit pypi
inherit setuptools3
inherit native
