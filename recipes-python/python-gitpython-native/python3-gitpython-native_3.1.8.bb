SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            ${PYTHON_PN}-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "84c2e13519693c7fe8a127630edf32d0"
SRC_URI[sha256sum] = "080bf8e2cf1a2b907634761c2eaefbe83b69930c94c66ad11b65a8252959f912"

inherit pypi
inherit setuptools3
inherit native
