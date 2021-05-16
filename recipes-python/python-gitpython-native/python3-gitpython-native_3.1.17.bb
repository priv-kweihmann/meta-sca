SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            python3-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "d69eed2c63bfb5d618e25a0c9d3db718"
SRC_URI[sha256sum] = "ee24bdc93dce357630764db659edaf6b8d664d4ff5447ccfeedd2dc5c253f41e"

inherit pypi
inherit setuptools3
inherit native
