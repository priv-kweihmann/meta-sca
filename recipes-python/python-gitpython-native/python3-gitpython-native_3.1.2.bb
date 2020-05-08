SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            ${PYTHON_PN}-ddt-native \
            ${PYTHON_PN}-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "2397bea2d7c36ef9f874ab6355abae59"
SRC_URI[sha256sum] = "864a47472548f3ba716ca202e034c1900f197c0fb3a08f641c20c3cafd15ed94"

inherit pypi
inherit setuptools3
inherit native
