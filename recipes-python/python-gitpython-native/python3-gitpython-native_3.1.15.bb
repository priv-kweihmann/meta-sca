SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            python3-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "f486b61f659bfd88c4f20ea7eeb83f21"
SRC_URI[sha256sum] = "05af150f47a5cca3f4b0af289b73aef8cf3c4fe2385015b06220cbcdee48bb6e"

inherit pypi
inherit setuptools3
inherit native
