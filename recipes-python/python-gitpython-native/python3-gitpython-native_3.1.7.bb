SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            ${PYTHON_PN}-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "ee379ff06c1fe36aa9f1123582e706c3"
SRC_URI[sha256sum] = "2db287d71a284e22e5c2846042d0602465c7434d910406990d5b74df4afb0858"

inherit pypi
inherit setuptools3
inherit native
