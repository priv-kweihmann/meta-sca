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

SRC_URI[md5sum] = "52d249d66cf37817971d7d678f63947a"
SRC_URI[sha256sum] = "e426c3b587bd58c482f0b7fe6145ff4ac7ae6c82673fc656f489719abca6f4cb"
