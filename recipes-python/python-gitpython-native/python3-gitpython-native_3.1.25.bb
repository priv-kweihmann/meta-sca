SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            python3-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "69554d72293696ca84f2be576cd9be43"
SRC_URI[sha256sum] = "b923e8952c2fe0d70b129fddd8511acc90b3070c8dddb20d86ca9911a5d0c248"

inherit pypi
inherit setuptools3
inherit native
