SUMMARY = "GitPython is a python library used to interact with Git repositories."
DESCRIPTION = "GitPython is a python library used to interact with Git repositories."
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-ddt-native ${PYTHON_PN}-gitdb-native"

PYPI_PACKAGE = "GitPython"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "7555ad89a22f663c25cced5f623bdef0"
SRC_URI[sha256sum] = "9c2398ffc3dcb3c40b27324b316f08a4f93ad646d5a6328cafbb871aa79f5e42"
