SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            python3-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "3cdcf86c4fe9e9d6c106efd3875dd770"
SRC_URI[sha256sum] = "aaae7a3bfdf0a6db30dc1f3aeae47b71cd326d86b936fe2e158aa925fdf1471c"

inherit pypi
inherit setuptools3
inherit native
