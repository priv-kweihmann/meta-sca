SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            python3-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "05113e0e57ed409a6ead7f52d348be54"
SRC_URI[sha256sum] = "befa4d101f91bad1b632df4308ec64555db684c360bd7d2130b4807d49ce86b8"

inherit pypi
inherit setuptools3
inherit native
