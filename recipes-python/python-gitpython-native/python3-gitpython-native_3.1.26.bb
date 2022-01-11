SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            python3-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "8830ff3026a81352a784c9b6956c3917"
SRC_URI[sha256sum] = "fc8868f63a2e6d268fb25f481995ba185a85a66fcad126f039323ff6635669ee"

inherit pypi
inherit setuptools3
inherit native
