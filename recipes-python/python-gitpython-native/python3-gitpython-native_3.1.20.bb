SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            python3-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "2c7874d082b9a8268cce78062540be95"
SRC_URI[sha256sum] = "df0e072a200703a65387b0cfdf0466e3bab729c0458cf6b7349d0e9877636519"

inherit pypi
inherit setuptools3
inherit native
